package com.yash.docapp.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;
import org.mockito.stubbing.Answer;

import com.yash.docapp.dao.DocumentDAO;
import com.yash.docapp.daoimpl.DocumentDaoImpl;
import com.yash.docapp.domain.Document;
import com.yash.docapp.service.DocumentService;
import com.yash.docapp.serviceimpl.DocumentServiceImpl;

public class DocumentServiceTest {
	@Test
	public void testDuplicateDocument_havingEmptyList_ShouldReturnNull() throws Exception {
		DocumentDAO documentdao = Mockito.mock(DocumentDAO.class);
		Mockito.when(documentdao.list()).thenReturn(Arrays.asList(new Document()));
		DocumentService documentservice = new DocumentServiceImpl(documentdao);
		List<Document> duplicates = documentservice.duplicateList();
		System.out.println(duplicates.size());
		assertEquals(0,duplicates.size());
	}
	
	@Test
	public void testDuplicateDocument_havingOneDocument_ShouldReturnNull() throws Exception {
		DocumentDAO documentdao = Mockito.mock(DocumentDAO.class);
		Mockito.when(documentdao.list()).thenReturn(Arrays.asList(new Document(101,"abc","abcddcba")));
		DocumentService documentservice = new DocumentServiceImpl(documentdao);
		List<Document> duplicates = documentservice.duplicateList();
		assertEquals(0,duplicates.size());
	}
	
	@Test
	public void testDuplicateDocument_havingTwoDocument_ShouldReturnDuplicateList() throws Exception {
		DocumentDAO documentdao = Mockito.mock(DocumentDAO.class);
		Mockito.when(documentdao.list()).thenReturn(Arrays.asList(new Document(101,"abc","abcddcba"),new Document(101,"abc","abcddcba")));
		
		DocumentService documentservice = new DocumentServiceImpl(documentdao);
		List<Document> duplicates = documentservice.duplicateList();
		System.out.println(duplicates.size());
		assertEquals(1,duplicates.size());
	}
	@Test
	public void testDuplicateDocument_havingThreeDocument_ShouldReturnDuplicateList() throws Exception {
		DocumentDAO documentdao = Mockito.mock(DocumentDAO.class);
		Mockito.when(documentdao.list()).thenReturn(Arrays.asList(new Document(101,"abc","abcddcba"),new Document(101,"abc","abcddcba"),new Document(102,"ab","abc"),new Document(101,"abc","abcddcba")));		
		DocumentService documentservice = new DocumentServiceImpl(documentdao);
		List<Document> duplicates = documentservice.duplicateList();
		System.out.println(duplicates.size());
		assertEquals(1,duplicates.size());
	}
	@Test
	public void testDuplicateDocument_havingMultipleDocument_ShouldReturnDuplicateList() throws Exception {
		DocumentDAO documentdao = Mockito.mock(DocumentDAO.class);
		Mockito.when(documentdao.list()).thenReturn(Arrays.asList(new Document(101,"abc","abcddcba"),new Document(101,"abc","abcddcba"),new Document(102,"ab","abc"),new Document(102,"ab","abc"),new Document(101,"abc","abcddcba")));		
		DocumentService documentservice = new DocumentServiceImpl(documentdao);
		List<Document> duplicates = documentservice.duplicateList();
		System.out.println(duplicates.size());
		assertEquals(2,duplicates.size());
	}
}
