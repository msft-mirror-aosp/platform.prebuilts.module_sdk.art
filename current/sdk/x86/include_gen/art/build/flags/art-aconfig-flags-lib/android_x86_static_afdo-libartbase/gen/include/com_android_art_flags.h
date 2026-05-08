#pragma once




#ifndef COM_ANDROID_ART_FLAGS
#define COM_ANDROID_ART_FLAGS(FLAG) COM_ANDROID_ART_FLAGS_##FLAG
#endif

#ifndef COM_ANDROID_ART_FLAGS_ALWAYS_ENABLE_PROFILE_CODE
#define COM_ANDROID_ART_FLAGS_ALWAYS_ENABLE_PROFILE_CODE false
#endif
#ifndef COM_ANDROID_ART_FLAGS_ART_MANAGED_INSTALL_FILES_VALIDATION_API
#define COM_ANDROID_ART_FLAGS_ART_MANAGED_INSTALL_FILES_VALIDATION_API true
#endif
#ifndef COM_ANDROID_ART_FLAGS_ART_SERVICE_V3
#define COM_ANDROID_ART_FLAGS_ART_SERVICE_V3 true
#endif
#ifndef COM_ANDROID_ART_FLAGS_ENFORCE_PERMITTED_SUBCLASSES_CHECKS
#define COM_ANDROID_ART_FLAGS_ENFORCE_PERMITTED_SUBCLASSES_CHECKS false
#endif
#ifndef COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS
#define COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS true
#endif
#ifndef COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS_DEPRECATION
#define COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS_DEPRECATION false
#endif
#ifndef COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS_V2
#define COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS_V2 true
#endif
#ifndef COM_ANDROID_ART_FLAGS_FAST_BASELINE_COMPILER
#define COM_ANDROID_ART_FLAGS_FAST_BASELINE_COMPILER false
#endif
#ifndef COM_ANDROID_ART_FLAGS_HIDDENAPI_JNI_API_CALLERS
#define COM_ANDROID_ART_FLAGS_HIDDENAPI_JNI_API_CALLERS false
#endif
#ifndef COM_ANDROID_ART_FLAGS_HIDDENAPI_PLATFORM_ENFORCEMENT
#define COM_ANDROID_ART_FLAGS_HIDDENAPI_PLATFORM_ENFORCEMENT false
#endif
#ifndef COM_ANDROID_ART_FLAGS_IGNORE_BOOT_IMAGE_EXTENSION_CLASS_RESOLUTION
#define COM_ANDROID_ART_FLAGS_IGNORE_BOOT_IMAGE_EXTENSION_CLASS_RESOLUTION false
#endif
#ifndef COM_ANDROID_ART_FLAGS_LOAD_STRING_IMG_REL_RO
#define COM_ANDROID_ART_FLAGS_LOAD_STRING_IMG_REL_RO false
#endif
#ifndef COM_ANDROID_ART_FLAGS_PACKAGE_LAST_USED_API
#define COM_ANDROID_ART_FLAGS_PACKAGE_LAST_USED_API true
#endif
#ifndef COM_ANDROID_ART_FLAGS_REG_ALLOC_LOOPS
#define COM_ANDROID_ART_FLAGS_REG_ALLOC_LOOPS false
#endif
#ifndef COM_ANDROID_ART_FLAGS_REG_ALLOC_NO_OUTPUT_OVERLAP
#define COM_ANDROID_ART_FLAGS_REG_ALLOC_NO_OUTPUT_OVERLAP false
#endif
#ifndef COM_ANDROID_ART_FLAGS_TEST
#define COM_ANDROID_ART_FLAGS_TEST true
#endif
#ifndef COM_ANDROID_ART_FLAGS_UPDATABLE_FILTER_AND_REASON
#define COM_ANDROID_ART_FLAGS_UPDATABLE_FILTER_AND_REASON true
#endif
#ifndef COM_ANDROID_ART_FLAGS_USE_GENERATIONAL_CMC
#define COM_ANDROID_ART_FLAGS_USE_GENERATIONAL_CMC true
#endif
#ifndef COM_ANDROID_ART_FLAGS_VALUE_CLASSES
#define COM_ANDROID_ART_FLAGS_VALUE_CLASSES false
#endif
#ifndef COM_ANDROID_ART_FLAGS_VIRTUAL_THREAD_IMPL_V1
#define COM_ANDROID_ART_FLAGS_VIRTUAL_THREAD_IMPL_V1 false
#endif
#ifndef COM_ANDROID_ART_FLAGS_WEAK_CONST_STRING
#define COM_ANDROID_ART_FLAGS_WEAK_CONST_STRING false
#endif
#ifndef COM_ANDROID_ART_FLAGS_X86_LEA_OPTIMIZATIONS
#define COM_ANDROID_ART_FLAGS_X86_LEA_OPTIMIZATIONS true
#endif

#ifdef __cplusplus

#include <memory>

namespace com::android::art::flags {

class flag_provider_interface {
public:
    virtual ~flag_provider_interface() = default;
    virtual bool always_enable_profile_code() = 0;
    virtual bool art_managed_install_files_validation_api() = 0;
    virtual bool art_service_v3() = 0;
    virtual bool enforce_permitted_subclasses_checks() = 0;
    virtual bool executable_method_file_offsets() = 0;
    virtual bool executable_method_file_offsets_deprecation() = 0;
    virtual bool executable_method_file_offsets_v2() = 0;
    virtual bool fast_baseline_compiler() = 0;
    virtual bool hiddenapi_jni_api_callers() = 0;
    virtual bool hiddenapi_platform_enforcement() = 0;
    virtual bool ignore_boot_image_extension_class_resolution() = 0;
    virtual bool load_string_img_rel_ro() = 0;
    virtual bool package_last_used_api() = 0;
    virtual bool reg_alloc_loops() = 0;
    virtual bool reg_alloc_no_output_overlap() = 0;
    virtual bool test() = 0;
    virtual bool updatable_filter_and_reason() = 0;
    virtual bool use_generational_cmc() = 0;
    virtual bool value_classes() = 0;
    virtual bool virtual_thread_impl_v1() = 0;
    virtual bool weak_const_string() = 0;
    virtual bool x86_lea_optimizations() = 0;
};

 extern std::unique_ptr<flag_provider_interface> provider_;


constexpr inline bool always_enable_profile_code() {
    return COM_ANDROID_ART_FLAGS_ALWAYS_ENABLE_PROFILE_CODE;
}
constexpr inline bool art_managed_install_files_validation_api() {
    return COM_ANDROID_ART_FLAGS_ART_MANAGED_INSTALL_FILES_VALIDATION_API;
}
constexpr inline bool art_service_v3() {
    return COM_ANDROID_ART_FLAGS_ART_SERVICE_V3;
}
constexpr inline bool enforce_permitted_subclasses_checks() {
    return COM_ANDROID_ART_FLAGS_ENFORCE_PERMITTED_SUBCLASSES_CHECKS;
}
constexpr inline bool executable_method_file_offsets() {
    return COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS;
}
constexpr inline bool executable_method_file_offsets_deprecation() {
    return COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS_DEPRECATION;
}
constexpr inline bool executable_method_file_offsets_v2() {
    return COM_ANDROID_ART_FLAGS_EXECUTABLE_METHOD_FILE_OFFSETS_V2;
}
constexpr inline bool fast_baseline_compiler() {
    return COM_ANDROID_ART_FLAGS_FAST_BASELINE_COMPILER;
}
constexpr inline bool hiddenapi_jni_api_callers() {
    return COM_ANDROID_ART_FLAGS_HIDDENAPI_JNI_API_CALLERS;
}
constexpr inline bool hiddenapi_platform_enforcement() {
    return COM_ANDROID_ART_FLAGS_HIDDENAPI_PLATFORM_ENFORCEMENT;
}
constexpr inline bool ignore_boot_image_extension_class_resolution() {
    return COM_ANDROID_ART_FLAGS_IGNORE_BOOT_IMAGE_EXTENSION_CLASS_RESOLUTION;
}
constexpr inline bool load_string_img_rel_ro() {
    return COM_ANDROID_ART_FLAGS_LOAD_STRING_IMG_REL_RO;
}
constexpr inline bool package_last_used_api() {
    return COM_ANDROID_ART_FLAGS_PACKAGE_LAST_USED_API;
}
constexpr inline bool reg_alloc_loops() {
    return COM_ANDROID_ART_FLAGS_REG_ALLOC_LOOPS;
}
constexpr inline bool reg_alloc_no_output_overlap() {
    return COM_ANDROID_ART_FLAGS_REG_ALLOC_NO_OUTPUT_OVERLAP;
}
constexpr inline bool test() {
    return COM_ANDROID_ART_FLAGS_TEST;
}
constexpr inline bool updatable_filter_and_reason() {
    return COM_ANDROID_ART_FLAGS_UPDATABLE_FILTER_AND_REASON;
}
constexpr inline bool use_generational_cmc() {
    return COM_ANDROID_ART_FLAGS_USE_GENERATIONAL_CMC;
}
constexpr inline bool value_classes() {
    return COM_ANDROID_ART_FLAGS_VALUE_CLASSES;
}
constexpr inline bool virtual_thread_impl_v1() {
    return COM_ANDROID_ART_FLAGS_VIRTUAL_THREAD_IMPL_V1;
}
constexpr inline bool weak_const_string() {
    return COM_ANDROID_ART_FLAGS_WEAK_CONST_STRING;
}
constexpr inline bool x86_lea_optimizations() {
    return COM_ANDROID_ART_FLAGS_X86_LEA_OPTIMIZATIONS;
}

}

extern "C" {
#endif // __cplusplus


bool com_android_art_flags_always_enable_profile_code();
bool com_android_art_flags_art_managed_install_files_validation_api();
bool com_android_art_flags_art_service_v3();
bool com_android_art_flags_enforce_permitted_subclasses_checks();
bool com_android_art_flags_executable_method_file_offsets();
bool com_android_art_flags_executable_method_file_offsets_deprecation();
bool com_android_art_flags_executable_method_file_offsets_v2();
bool com_android_art_flags_fast_baseline_compiler();
bool com_android_art_flags_hiddenapi_jni_api_callers();
bool com_android_art_flags_hiddenapi_platform_enforcement();
bool com_android_art_flags_ignore_boot_image_extension_class_resolution();
bool com_android_art_flags_load_string_img_rel_ro();
bool com_android_art_flags_package_last_used_api();
bool com_android_art_flags_reg_alloc_loops();
bool com_android_art_flags_reg_alloc_no_output_overlap();
bool com_android_art_flags_test();
bool com_android_art_flags_updatable_filter_and_reason();
bool com_android_art_flags_use_generational_cmc();
bool com_android_art_flags_value_classes();
bool com_android_art_flags_virtual_thread_impl_v1();
bool com_android_art_flags_weak_const_string();
bool com_android_art_flags_x86_lea_optimizations();

#ifdef __cplusplus
} // extern "C"
#endif

