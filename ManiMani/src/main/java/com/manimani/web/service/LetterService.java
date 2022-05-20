package com.manimani.web.service;
import java.util.*;
import org.springframework.stereotype.Service;
import com.manimani.web.vo.*;

@Service
public interface LetterService {
	public List<LetterVO> letterList();
}
