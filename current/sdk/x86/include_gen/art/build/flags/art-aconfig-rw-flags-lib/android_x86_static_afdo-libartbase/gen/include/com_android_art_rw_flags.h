#pragma once






#ifdef __cplusplus

#include <memory>

namespace com::android::art::rw::flags {

class flag_provider_interface {
public:
    virtual ~flag_provider_interface() = default;
    virtual bool dynamic_instrumentation_method_entry_hook() = 0;
    virtual bool enable_profile_code_rw() = 0;
    virtual bool enable_time_based_gc_triggering() = 0;
    virtual bool hybrid_pre_reboot_dexopt() = 0;
    virtual bool jfield_id_change() = 0;
    virtual bool lower_young_gc_throughput_expectation() = 0;
    virtual bool lse_quick_lock() = 0;
    virtual bool madvise_dex_using_profile() = 0;
    virtual bool madvise_optimized_readahead() = 0;
    virtual bool madvise_type_lookup_table() = 0;
    virtual bool native_alloc_time_based_gc_triggering_bugfix() = 0;
    virtual bool packed_switch_simplification() = 0;
    virtual bool pm_compile_verbose_logging() = 0;
    virtual bool read_only_dynamic_code_load_throw_exception() = 0;
    virtual bool read_only_dynamic_code_load_ww_log() = 0;
    virtual bool secure_compilation() = 0;
    virtual bool skip_background_classes_in_profiles() = 0;
    virtual bool test_rw_flag() = 0;
    virtual bool time_based_gc_triggering_via_integral() = 0;
    virtual bool use_uffd_move_ioctl_cmc_gc() = 0;
};

 extern std::unique_ptr<flag_provider_interface> provider_;


inline bool dynamic_instrumentation_method_entry_hook() {
    return true;
}
inline bool enable_profile_code_rw() {
    return false;
}
inline bool enable_time_based_gc_triggering() {
    return true;
}
inline bool hybrid_pre_reboot_dexopt() {
    return true;
}
inline bool jfield_id_change() {
    return false;
}
inline bool lower_young_gc_throughput_expectation() {
    return true;
}
inline bool lse_quick_lock() {
    return true;
}
inline bool madvise_dex_using_profile() {
    return true;
}
inline bool madvise_optimized_readahead() {
    return false;
}
inline bool madvise_type_lookup_table() {
    return false;
}
inline bool native_alloc_time_based_gc_triggering_bugfix() {
    return true;
}
inline bool packed_switch_simplification() {
    return false;
}
inline bool pm_compile_verbose_logging() {
    return false;
}
inline bool read_only_dynamic_code_load_throw_exception() {
    return true;
}
inline bool read_only_dynamic_code_load_ww_log() {
    return true;
}
inline bool secure_compilation() {
    return false;
}
inline bool skip_background_classes_in_profiles() {
    return false;
}
inline bool test_rw_flag() {
    return true;
}
inline bool time_based_gc_triggering_via_integral() {
    return false;
}
inline bool use_uffd_move_ioctl_cmc_gc() {
    return true;
}

}

extern "C" {
#endif // __cplusplus


bool com_android_art_rw_flags_dynamic_instrumentation_method_entry_hook();
bool com_android_art_rw_flags_enable_profile_code_rw();
bool com_android_art_rw_flags_enable_time_based_gc_triggering();
bool com_android_art_rw_flags_hybrid_pre_reboot_dexopt();
bool com_android_art_rw_flags_jfield_id_change();
bool com_android_art_rw_flags_lower_young_gc_throughput_expectation();
bool com_android_art_rw_flags_lse_quick_lock();
bool com_android_art_rw_flags_madvise_dex_using_profile();
bool com_android_art_rw_flags_madvise_optimized_readahead();
bool com_android_art_rw_flags_madvise_type_lookup_table();
bool com_android_art_rw_flags_native_alloc_time_based_gc_triggering_bugfix();
bool com_android_art_rw_flags_packed_switch_simplification();
bool com_android_art_rw_flags_pm_compile_verbose_logging();
bool com_android_art_rw_flags_read_only_dynamic_code_load_throw_exception();
bool com_android_art_rw_flags_read_only_dynamic_code_load_ww_log();
bool com_android_art_rw_flags_secure_compilation();
bool com_android_art_rw_flags_skip_background_classes_in_profiles();
bool com_android_art_rw_flags_test_rw_flag();
bool com_android_art_rw_flags_time_based_gc_triggering_via_integral();
bool com_android_art_rw_flags_use_uffd_move_ioctl_cmc_gc();

#ifdef __cplusplus
} // extern "C"
#endif

