package com.itemis.mobile.physis.generator;

import java.util.HashMap;

import com.itemis.mobile.physis.physis.BuiltInType;
import com.itemis.mobile.physis.physis.PhysisPackage;
import com.itemis.mobile.physis.physis.Reference;

public class TypeMapper {
	
	private HashMap<String, String> typeMap = new HashMap<String, String>();
	private HashMap<String, String> dbtypeMap = new HashMap<String, String>();
	
	public TypeMapper() {
		typeMap.put(PhysisPackage.Literals.BOOLEAN_TYPE.getName(), "NSNumber");
		typeMap.put(PhysisPackage.Literals.DATE_TYPE.getName(), "NSDate");
		typeMap.put(PhysisPackage.Literals.DOUBLE_TYPE.getName(), "NSNumber");
		typeMap.put(PhysisPackage.Literals.FLOAT_TYPE.getName(), "NSNumber");
		typeMap.put(PhysisPackage.Literals.INTEGER_TYPE.getName(), "NSNumber");
		typeMap.put(PhysisPackage.Literals.STRING_TYPE.getName(), "NSString");

		dbtypeMap.put(PhysisPackage.Literals.BOOLEAN_TYPE.getName(), "NSBoolean");
		dbtypeMap.put(PhysisPackage.Literals.DATE_TYPE.getName(), "NSDate");
		dbtypeMap.put(PhysisPackage.Literals.DOUBLE_TYPE.getName(), "NSDouble");
		dbtypeMap.put(PhysisPackage.Literals.FLOAT_TYPE.getName(), "NSFloat");
		dbtypeMap.put(PhysisPackage.Literals.INTEGER_TYPE.getName(), "NSInteger32");
		dbtypeMap.put(PhysisPackage.Literals.STRING_TYPE.getName(), "NSString");		
	}
	
	public String getTypeName(BuiltInType type) {
		return typeMap.get(type.eClass().getName());
	}
	
	public String getDBMappingTypeName(BuiltInType type) {
		return dbtypeMap.get(type.eClass().getName());
	}
	
	public boolean isPrimitiveType(Reference reference) {
		if (reference instanceof BuiltInType) {
			BuiltInType builtintype = (BuiltInType) reference;
			String typeName = getTypeName(builtintype);
			return (typeName.equals("NSInteger"));
		}
		return false;
	}

}
