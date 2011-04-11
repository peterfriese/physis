package com.itemis.mobile.physis.generator.iOS;

import java.util.Date;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.StringExtensions;
import org.eclipse.xtext.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class AbstractIOSBaseGenerator {
  private final AbstractIOSBaseGenerator _this = this;
  
  public StringConcatenation fileheaderComment(final EObject object, final boolean header) {
    StringConcatenation _xblockexpression = null;
    {
      Date _date = new Date();
      final Date date = _date;
      String _localeString = date.toLocaleString();
      final String today = _localeString;
      String _xifexpression = null;
      if (((Boolean)header)) {
        String _headerFileName = _this.headerFileName(object);
        _xifexpression = _headerFileName;
      } else {
        String _moduleFileName = _this.moduleFileName(object);
        _xifexpression = _moduleFileName;
      }
      final String filename = _xifexpression;
      StringConcatenation builder = new StringConcatenation();
      builder.append("//");
      builder.newLine();
      builder.append("//  ");
      builder.append(filename, "");
      builder.newLineIfNotEmpty();
      builder.append("//  [TODO: projectName]");
      builder.newLine();
      builder.append("//");
      builder.newLine();
      builder.append("//  Created by [TODO: authorname] on ");
      builder.append(today, "");
      builder.append(".");
      builder.newLineIfNotEmpty();
      builder.append("//  [TODO: copyright string]");
      builder.newLine();
      builder.append("//");
      builder.newLine();
      _xblockexpression = (builder);
    }
    return _xblockexpression;
  }
  
  public String baseFileName(final EObject object) throws RuntimeException{
    RuntimeException _runtimeException = new RuntimeException("You need to override baseFileName in your generator class!");
    throw _runtimeException;
  }
  
  public String headerFileName(final EObject object) {
    String _baseFileName = _this.baseFileName(object);
    String _operator_plus = StringExtensions.operator_plus(_baseFileName, ".h");
    return _operator_plus;
  }
  
  public String moduleFileName(final EObject object) {
    String _baseFileName = _this.baseFileName(object);
    String _operator_plus = StringExtensions.operator_plus(_baseFileName, ".m");
    return _operator_plus;
  }
}