package com.ethen.test;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.SimpleMetadataReaderFactory;

import java.io.IOException;

public class MetaDataReaderTest {
	public static void main(String[] args) throws IOException {
		final SimpleMetadataReaderFactory readerFactory = new SimpleMetadataReaderFactory();
		final MetadataReader metadataReader = readerFactory.getMetadataReader("com.ethen.bean.UserController");
		final ClassMetadata classMetadata = metadataReader.getClassMetadata();
		System.err.println(classMetadata);
		final AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
		System.err.println(annotationMetadata);
		final Resource resource = metadataReader.getResource();
		System.err.println(resource.getFile().getAbsolutePath());
		System.err.println(annotationMetadata.getAnnotationTypes());

	}
}
