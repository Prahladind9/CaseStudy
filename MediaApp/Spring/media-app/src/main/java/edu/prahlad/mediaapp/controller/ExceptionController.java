package edu.prahlad.mediaapp.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import edu.prahlad.mediaapp.exception.PlaylistNotFoundException;
import edu.prahlad.mediaapp.exception.SongNotFoundException;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler
    public ResponseEntity<?> playlistNotFound(PlaylistNotFoundException ex) {
        return ResponseEntity.badRequest().body(new ResponseStatusError(ErrorCodes.PLAYLIST_NOT_FOUND.code(), ex.getMessage()));
    }

    @ExceptionHandler
    public ResponseEntity<?> songNotFound(SongNotFoundException ex) {
        return ResponseEntity.badRequest().body(new ResponseStatusError(ErrorCodes.SONG_NOT_FOUND.code(), ex.getMessage()));
    }
}

@Data
@AllArgsConstructor
class ResponseStatusError {

    @JsonProperty("status_code")
    private int status;

    @JsonProperty("status_message")
    private String message;
}


enum ErrorCodes {

    PLAYLIST_NOT_FOUND(1001),
    SONG_NOT_FOUND(1002);

    private int code;

    ErrorCodes(int code) {
        this.code = code;
    }

    public int code() {
        return this.code;
    }

}