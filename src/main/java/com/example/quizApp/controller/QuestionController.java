package com.example.quizApp.controller;

import com.example.quizApp.dao.QuestionDao;
import com.example.quizApp.model.Question;
import com.example.quizApp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;
    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestions()
    {
        return questionService.getAllQuestions();
    }
    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category)
    {
        return questionService.getQuestionByCategory(category);
    }
    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question)
    {
        return questionService.addQuestion(question);
    }
    @PutMapping("update")
    public ResponseEntity<String> updateQuestion(@RequestBody Question question)
    {
        return questionService.updateQuestion(question);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteMapping(@PathVariable Integer id)
    {
        return questionService.deleteQuestion(id);
    }

}
