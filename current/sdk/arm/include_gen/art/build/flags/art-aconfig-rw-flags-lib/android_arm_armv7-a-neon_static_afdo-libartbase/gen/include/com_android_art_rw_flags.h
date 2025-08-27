#pragma once






#ifdef __cplusplus

#include <memory>

namespace com::android::art::rw::flags {

class flag_provider_interface {
public:
    virtual ~flag_provider_interface() = default;
    virtual bool assume_value_sdk_int() = 0;
    virtual bool enable_profile_code_rw() = 0;
    virtual bool enable_time_based_gc_triggering() = 0;
    virtual bool madvise_type_lookup_table() = 0;
    virtual bool post_ur_job() = 0;
    virtual bool test_rw_flag() = 0;
    virtual bool use_uffd_move_ioctl_cmc_gc() = 0;
};

 extern std::unique_ptr<flag_provider_interface> provider_;


inline bool assume_value_sdk_int() {
    return false;
}
inline bool enable_profile_code_rw() {
    return false;
}
inline bool enable_time_based_gc_triggering() {
    return false;
}
inline bool madvise_type_lookup_table() {
    return false;
}
inline bool post_ur_job() {
    return true;
}
inline bool test_rw_flag() {
    return true;
}
inline bool use_uffd_move_ioctl_cmc_gc() {
    return false;
}

}

extern "C" {
#endif // __cplusplus


bool com_android_art_rw_flags_assume_value_sdk_int();
bool com_android_art_rw_flags_enable_profile_code_rw();
bool com_android_art_rw_flags_enable_time_based_gc_triggering();
bool com_android_art_rw_flags_madvise_type_lookup_table();
bool com_android_art_rw_flags_post_ur_job();
bool com_android_art_rw_flags_test_rw_flag();
bool com_android_art_rw_flags_use_uffd_move_ioctl_cmc_gc();

#ifdef __cplusplus
} // extern "C"
#endif

