package com.nutcha.awsimagedownload.dataStore;

import com.nutcha.awsimagedownload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("811f3832-1faf-4ff3-a83f-9c261db54249"), "Anton", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("94f6acdd-61fb-48e3-a3dc-5bc1a36dac49"), "Simon", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }

}
