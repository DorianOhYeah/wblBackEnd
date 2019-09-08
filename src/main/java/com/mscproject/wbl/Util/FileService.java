package com.mscproject.wbl.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;

import java.net.MalformedURLException;
import java.nio.file.Path;

public class FileService {


        public Resource loadFileAsResource(String fileName) {
            try {
                String filePath = "/Users/dorian/Desktop/testSubmission/";
                String realPath = filePath+fileName;
                Resource resource = new UrlResource(realPath);
                if(resource.exists()) {
                    return resource;
                } else {
                    throw new FileException("File not found " + fileName);
                }
            } catch (MalformedURLException ex) {
                throw new FileException("File not found " + fileName, ex);
            }
        }
}
