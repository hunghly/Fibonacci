#set up local variable
LOCAL_PATH:=$(call my-dir)
include $(CLEAR_VARS)
LOCAL_SRC_FILES:=com_example_fibonacci_FibLib.c
LOCAL_MODULE:=com_example_fibonacci_FibLib
include $(BUILD_SHARED_LIBRARY)