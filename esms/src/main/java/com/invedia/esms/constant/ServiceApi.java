package com.invedia.esms.constant;

public class ServiceApi {

    public static final String CONTEXT_API = "/api";

    public class Account {

        public static final String CONTEXT_API = "/account";

        public static final String LIST_ALL_API = "/all";
    }

    public class Attendance {

        public static final String CONTEXT_API = "/attendance";

        public static final String LIST_API = "/list";

        public static final String MARK_ATTENDANCE_API = "/mark";

    }

    public class ClassRoom {

        public static final String CONTEXT_API = "/class";

        public static final String CLASS_LIST_API = "/list";

        public static final String SAVE_API = "/save";
    }

    public class Course {

        public static final String CONTEXT_API = "/course";

        public static final String COURSE_LIST_API = "/list";

        public static final String SAVE_API = "/save";

        public static final String ASSIGN_SUBJECT_API = "/assign-subject";

        public static final String LIST_SUBJECT_BATCH_API = "/batch-list";
    }

    public class Examination {

        public static final String CONTEXT_API = "/examination";

        public static final String GET_EXAMINATION_LIST_API = "/list";

        public static final String SAVE_API = "/save";

        public static final String EXAMINATION_GRADE_API = "/mark";

        public static final String EXAMINATION_RESULT_BY_STUDENT_API = "/student-list";

    }

    public class Guardian {

        public static final String CONTEXT_API = "/guardian";

        public static final String LIST_ALL = "/list";

        public static final String ASSIGN_STUDENTS_API = "/assign-students";
    }

    public class Student {

        public static final String CONTEXT_API = "/student";

        public static final String STUDENT_LIST = "/list";

        public static final String ASSIGN_GUARDIANS_API = "/assign-guardians";
    }

    public class Teacher {

        public static final String CONTEXT_API = "/teacher";

        public static final String LIST_API = "/list";
    }

    public class Academic {

        public static final String CONTEXT_API = "/academic";

        public static final String SAVE_API = "/save";

        public static final String LIST_API = "/list";
    }

    public class Slot {

        public static final String CONTEXT_API = "/slot";

        public static final String SAVE_API = "/save";

        public static final String LIST_API = "/list";

        public static final String LIST_BY_CLASS_ID = "/class";
    }

    public class Subject {

        public static final String CONTEXT_API = "/subject";

        public static final String LIST_API = "/list";

        public static final String LIST_TEACHERS_BATCH = "/teacher";
    }
}

