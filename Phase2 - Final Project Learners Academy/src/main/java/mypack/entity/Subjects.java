package mypack.entity;

public class Subjects {
private int subjectId;
private String subjectName;
private int classId;
private String className;

public Subjects() {
	// TODO Auto-generated constructor stub
}

public int getSubjectId() {
	return subjectId;
}

public int getClassId() {
	return classId;
}

public void setClassId(int classId) {
	this.classId = classId;
}

public String getClassName() {
	return className;
}

public void setClassName(String className) {
	this.className = className;
}

public void setSubjectId(int subjectId) {
	this.subjectId = subjectId;
}

public String getSubjectName() {
	return subjectName;
}

public void setSubjectName(String subjectName) {
	this.subjectName = subjectName;
}

@Override
public String toString() {
	return "Subjects [subjectId=" + subjectId + ", subjectName=" + subjectName + ", classId=" + classId + ", className="
			+ className + "]";
}



}
