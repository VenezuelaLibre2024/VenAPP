.class public final Lk4/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk4/e$c;,
        Lk4/e$b;,
        Lk4/e$a;,
        Lk4/e$d;,
        Lk4/e$e;
    }
.end annotation


# static fields
.field public static final a:Lk4/e;

.field private static final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lk4/b;",
            "Lk4/e$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lk4/m;",
            "Lk4/e$b;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lk4/j;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lk4/e;

    invoke-direct {v0}, Lk4/e;-><init>()V

    sput-object v0, Lk4/e;->a:Lk4/e;

    const/16 v0, 0x11

    new-array v1, v0, [Lck/m;

    sget-object v2, Lk4/b;->ANON_ID:Lk4/b;

    new-instance v3, Lk4/e$c;

    sget-object v4, Lk4/k;->USER_DATA:Lk4/k;

    sget-object v5, Lk4/l;->ANON_ID:Lk4/l;

    invoke-direct {v3, v4, v5}, Lk4/e$c;-><init>(Lk4/k;Lk4/l;)V

    invoke-static {v2, v3}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Lk4/b;->APP_USER_ID:Lk4/b;

    new-instance v5, Lk4/e$c;

    sget-object v6, Lk4/l;->FB_LOGIN_ID:Lk4/l;

    invoke-direct {v5, v4, v6}, Lk4/e$c;-><init>(Lk4/k;Lk4/l;)V

    invoke-static {v2, v5}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/4 v5, 0x1

    aput-object v2, v1, v5

    sget-object v2, Lk4/b;->ADVERTISER_ID:Lk4/b;

    new-instance v6, Lk4/e$c;

    sget-object v7, Lk4/l;->MAD_ID:Lk4/l;

    invoke-direct {v6, v4, v7}, Lk4/e$c;-><init>(Lk4/k;Lk4/l;)V

    invoke-static {v2, v6}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/4 v6, 0x2

    aput-object v2, v1, v6

    sget-object v2, Lk4/b;->PAGE_ID:Lk4/b;

    new-instance v7, Lk4/e$c;

    sget-object v8, Lk4/l;->PAGE_ID:Lk4/l;

    invoke-direct {v7, v4, v8}, Lk4/e$c;-><init>(Lk4/k;Lk4/l;)V

    invoke-static {v2, v7}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/4 v7, 0x3

    aput-object v2, v1, v7

    sget-object v2, Lk4/b;->PAGE_SCOPED_USER_ID:Lk4/b;

    new-instance v8, Lk4/e$c;

    sget-object v9, Lk4/l;->PAGE_SCOPED_USER_ID:Lk4/l;

    invoke-direct {v8, v4, v9}, Lk4/e$c;-><init>(Lk4/k;Lk4/l;)V

    invoke-static {v2, v8}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/4 v8, 0x4

    aput-object v2, v1, v8

    sget-object v2, Lk4/b;->ADV_TE:Lk4/b;

    new-instance v9, Lk4/e$c;

    sget-object v10, Lk4/k;->APP_DATA:Lk4/k;

    sget-object v11, Lk4/l;->ADV_TE:Lk4/l;

    invoke-direct {v9, v10, v11}, Lk4/e$c;-><init>(Lk4/k;Lk4/l;)V

    invoke-static {v2, v9}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/4 v9, 0x5

    aput-object v2, v1, v9

    sget-object v2, Lk4/b;->APP_TE:Lk4/b;

    new-instance v11, Lk4/e$c;

    sget-object v12, Lk4/l;->APP_TE:Lk4/l;

    invoke-direct {v11, v10, v12}, Lk4/e$c;-><init>(Lk4/k;Lk4/l;)V

    invoke-static {v2, v11}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/4 v11, 0x6

    aput-object v2, v1, v11

    sget-object v2, Lk4/b;->CONSIDER_VIEWS:Lk4/b;

    new-instance v12, Lk4/e$c;

    sget-object v13, Lk4/l;->CONSIDER_VIEWS:Lk4/l;

    invoke-direct {v12, v10, v13}, Lk4/e$c;-><init>(Lk4/k;Lk4/l;)V

    invoke-static {v2, v12}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/4 v12, 0x7

    aput-object v2, v1, v12

    sget-object v2, Lk4/b;->DEVICE_TOKEN:Lk4/b;

    new-instance v13, Lk4/e$c;

    sget-object v14, Lk4/l;->DEVICE_TOKEN:Lk4/l;

    invoke-direct {v13, v10, v14}, Lk4/e$c;-><init>(Lk4/k;Lk4/l;)V

    invoke-static {v2, v13}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/16 v13, 0x8

    aput-object v2, v1, v13

    sget-object v2, Lk4/b;->EXT_INFO:Lk4/b;

    new-instance v14, Lk4/e$c;

    sget-object v15, Lk4/l;->EXT_INFO:Lk4/l;

    invoke-direct {v14, v10, v15}, Lk4/e$c;-><init>(Lk4/k;Lk4/l;)V

    invoke-static {v2, v14}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/16 v14, 0x9

    aput-object v2, v1, v14

    sget-object v2, Lk4/b;->INCLUDE_DWELL_DATA:Lk4/b;

    new-instance v15, Lk4/e$c;

    sget-object v14, Lk4/l;->INCLUDE_DWELL_DATA:Lk4/l;

    invoke-direct {v15, v10, v14}, Lk4/e$c;-><init>(Lk4/k;Lk4/l;)V

    invoke-static {v2, v15}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/16 v14, 0xa

    aput-object v2, v1, v14

    sget-object v2, Lk4/b;->INCLUDE_VIDEO_DATA:Lk4/b;

    new-instance v15, Lk4/e$c;

    sget-object v14, Lk4/l;->INCLUDE_VIDEO_DATA:Lk4/l;

    invoke-direct {v15, v10, v14}, Lk4/e$c;-><init>(Lk4/k;Lk4/l;)V

    invoke-static {v2, v15}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/16 v14, 0xb

    aput-object v2, v1, v14

    sget-object v2, Lk4/b;->INSTALL_REFERRER:Lk4/b;

    new-instance v15, Lk4/e$c;

    sget-object v14, Lk4/l;->INSTALL_REFERRER:Lk4/l;

    invoke-direct {v15, v10, v14}, Lk4/e$c;-><init>(Lk4/k;Lk4/l;)V

    invoke-static {v2, v15}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/16 v14, 0xc

    aput-object v2, v1, v14

    sget-object v2, Lk4/b;->INSTALLER_PACKAGE:Lk4/b;

    new-instance v15, Lk4/e$c;

    sget-object v14, Lk4/l;->INSTALLER_PACKAGE:Lk4/l;

    invoke-direct {v15, v10, v14}, Lk4/e$c;-><init>(Lk4/k;Lk4/l;)V

    invoke-static {v2, v15}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/16 v14, 0xd

    aput-object v2, v1, v14

    sget-object v2, Lk4/b;->RECEIPT_DATA:Lk4/b;

    new-instance v15, Lk4/e$c;

    sget-object v14, Lk4/l;->RECEIPT_DATA:Lk4/l;

    invoke-direct {v15, v10, v14}, Lk4/e$c;-><init>(Lk4/k;Lk4/l;)V

    invoke-static {v2, v15}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/16 v14, 0xe

    aput-object v2, v1, v14

    sget-object v2, Lk4/b;->URL_SCHEMES:Lk4/b;

    new-instance v15, Lk4/e$c;

    sget-object v14, Lk4/l;->URL_SCHEMES:Lk4/l;

    invoke-direct {v15, v10, v14}, Lk4/e$c;-><init>(Lk4/k;Lk4/l;)V

    invoke-static {v2, v15}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/16 v10, 0xf

    aput-object v2, v1, v10

    sget-object v2, Lk4/b;->USER_DATA:Lk4/b;

    new-instance v14, Lk4/e$c;

    const/4 v15, 0x0

    invoke-direct {v14, v4, v15}, Lk4/e$c;-><init>(Lk4/k;Lk4/l;)V

    invoke-static {v2, v14}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v2

    const/16 v4, 0x10

    aput-object v2, v1, v4

    invoke-static {v1}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object v1

    sput-object v1, Lk4/e;->b:Ljava/util/Map;

    new-array v0, v0, [Lck/m;

    sget-object v1, Lk4/m;->EVENT_TIME:Lk4/m;

    new-instance v2, Lk4/e$b;

    sget-object v14, Lk4/i;->EVENT_TIME:Lk4/i;

    invoke-direct {v2, v15, v14}, Lk4/e$b;-><init>(Lk4/k;Lk4/i;)V

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v3

    sget-object v1, Lk4/m;->EVENT_NAME:Lk4/m;

    new-instance v2, Lk4/e$b;

    sget-object v14, Lk4/i;->EVENT_NAME:Lk4/i;

    invoke-direct {v2, v15, v14}, Lk4/e$b;-><init>(Lk4/k;Lk4/i;)V

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v5

    sget-object v1, Lk4/m;->VALUE_TO_SUM:Lk4/m;

    new-instance v2, Lk4/e$b;

    sget-object v14, Lk4/k;->CUSTOM_DATA:Lk4/k;

    sget-object v15, Lk4/i;->VALUE_TO_SUM:Lk4/i;

    invoke-direct {v2, v14, v15}, Lk4/e$b;-><init>(Lk4/k;Lk4/i;)V

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v6

    sget-object v1, Lk4/m;->CONTENT_IDS:Lk4/m;

    new-instance v2, Lk4/e$b;

    sget-object v15, Lk4/i;->CONTENT_IDS:Lk4/i;

    invoke-direct {v2, v14, v15}, Lk4/e$b;-><init>(Lk4/k;Lk4/i;)V

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v7

    sget-object v1, Lk4/m;->CONTENTS:Lk4/m;

    new-instance v2, Lk4/e$b;

    sget-object v15, Lk4/i;->CONTENTS:Lk4/i;

    invoke-direct {v2, v14, v15}, Lk4/e$b;-><init>(Lk4/k;Lk4/i;)V

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v8

    sget-object v1, Lk4/m;->CONTENT_TYPE:Lk4/m;

    new-instance v2, Lk4/e$b;

    sget-object v15, Lk4/i;->CONTENT_TYPE:Lk4/i;

    invoke-direct {v2, v14, v15}, Lk4/e$b;-><init>(Lk4/k;Lk4/i;)V

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v9

    sget-object v1, Lk4/m;->CURRENCY:Lk4/m;

    new-instance v2, Lk4/e$b;

    sget-object v15, Lk4/i;->CURRENCY:Lk4/i;

    invoke-direct {v2, v14, v15}, Lk4/e$b;-><init>(Lk4/k;Lk4/i;)V

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v11

    sget-object v1, Lk4/m;->DESCRIPTION:Lk4/m;

    new-instance v2, Lk4/e$b;

    sget-object v15, Lk4/i;->DESCRIPTION:Lk4/i;

    invoke-direct {v2, v14, v15}, Lk4/e$b;-><init>(Lk4/k;Lk4/i;)V

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v12

    sget-object v1, Lk4/m;->LEVEL:Lk4/m;

    new-instance v2, Lk4/e$b;

    sget-object v15, Lk4/i;->LEVEL:Lk4/i;

    invoke-direct {v2, v14, v15}, Lk4/e$b;-><init>(Lk4/k;Lk4/i;)V

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v13

    sget-object v1, Lk4/m;->MAX_RATING_VALUE:Lk4/m;

    new-instance v2, Lk4/e$b;

    sget-object v15, Lk4/i;->MAX_RATING_VALUE:Lk4/i;

    invoke-direct {v2, v14, v15}, Lk4/e$b;-><init>(Lk4/k;Lk4/i;)V

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    sget-object v1, Lk4/m;->NUM_ITEMS:Lk4/m;

    new-instance v2, Lk4/e$b;

    sget-object v15, Lk4/i;->NUM_ITEMS:Lk4/i;

    invoke-direct {v2, v14, v15}, Lk4/e$b;-><init>(Lk4/k;Lk4/i;)V

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sget-object v1, Lk4/m;->PAYMENT_INFO_AVAILABLE:Lk4/m;

    new-instance v2, Lk4/e$b;

    sget-object v15, Lk4/i;->PAYMENT_INFO_AVAILABLE:Lk4/i;

    invoke-direct {v2, v14, v15}, Lk4/e$b;-><init>(Lk4/k;Lk4/i;)V

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    sget-object v1, Lk4/m;->REGISTRATION_METHOD:Lk4/m;

    new-instance v2, Lk4/e$b;

    sget-object v15, Lk4/i;->REGISTRATION_METHOD:Lk4/i;

    invoke-direct {v2, v14, v15}, Lk4/e$b;-><init>(Lk4/k;Lk4/i;)V

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    sget-object v1, Lk4/m;->SEARCH_STRING:Lk4/m;

    new-instance v2, Lk4/e$b;

    sget-object v15, Lk4/i;->SEARCH_STRING:Lk4/i;

    invoke-direct {v2, v14, v15}, Lk4/e$b;-><init>(Lk4/k;Lk4/i;)V

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    sget-object v1, Lk4/m;->SUCCESS:Lk4/m;

    new-instance v2, Lk4/e$b;

    sget-object v15, Lk4/i;->SUCCESS:Lk4/i;

    invoke-direct {v2, v14, v15}, Lk4/e$b;-><init>(Lk4/k;Lk4/i;)V

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v2, 0xe

    aput-object v1, v0, v2

    sget-object v1, Lk4/m;->ORDER_ID:Lk4/m;

    new-instance v2, Lk4/e$b;

    sget-object v15, Lk4/i;->ORDER_ID:Lk4/i;

    invoke-direct {v2, v14, v15}, Lk4/e$b;-><init>(Lk4/k;Lk4/i;)V

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v10

    sget-object v1, Lk4/m;->AD_TYPE:Lk4/m;

    new-instance v2, Lk4/e$b;

    sget-object v10, Lk4/i;->AD_TYPE:Lk4/i;

    invoke-direct {v2, v14, v10}, Lk4/e$b;-><init>(Lk4/k;Lk4/i;)V

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v4

    invoke-static {v0}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lk4/e;->c:Ljava/util/Map;

    const/16 v0, 0xe

    new-array v0, v0, [Lck/m;

    const-string v1, "fb_mobile_achievement_unlocked"

    sget-object v2, Lk4/j;->UNLOCKED_ACHIEVEMENT:Lk4/j;

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v3

    const-string v1, "fb_mobile_activate_app"

    sget-object v2, Lk4/j;->ACTIVATED_APP:Lk4/j;

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v5

    const-string v1, "fb_mobile_add_payment_info"

    sget-object v2, Lk4/j;->ADDED_PAYMENT_INFO:Lk4/j;

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v6

    const-string v1, "fb_mobile_add_to_cart"

    sget-object v2, Lk4/j;->ADDED_TO_CART:Lk4/j;

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v7

    const-string v1, "fb_mobile_add_to_wishlist"

    sget-object v2, Lk4/j;->ADDED_TO_WISHLIST:Lk4/j;

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v8

    const-string v1, "fb_mobile_complete_registration"

    sget-object v2, Lk4/j;->COMPLETED_REGISTRATION:Lk4/j;

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v9

    const-string v1, "fb_mobile_content_view"

    sget-object v2, Lk4/j;->VIEWED_CONTENT:Lk4/j;

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v11

    const-string v1, "fb_mobile_initiated_checkout"

    sget-object v2, Lk4/j;->INITIATED_CHECKOUT:Lk4/j;

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v12

    const-string v1, "fb_mobile_level_achieved"

    sget-object v2, Lk4/j;->ACHIEVED_LEVEL:Lk4/j;

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    aput-object v1, v0, v13

    const-string v1, "fb_mobile_purchase"

    sget-object v2, Lk4/j;->PURCHASED:Lk4/j;

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v2, 0x9

    aput-object v1, v0, v2

    const-string v1, "fb_mobile_rate"

    sget-object v2, Lk4/j;->RATED:Lk4/j;

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v2, 0xa

    aput-object v1, v0, v2

    const-string v1, "fb_mobile_search"

    sget-object v2, Lk4/j;->SEARCHED:Lk4/j;

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v2, 0xb

    aput-object v1, v0, v2

    const-string v1, "fb_mobile_spent_credits"

    sget-object v2, Lk4/j;->SPENT_CREDITS:Lk4/j;

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v2, 0xc

    aput-object v1, v0, v2

    const-string v1, "fb_mobile_tutorial_completion"

    sget-object v2, Lk4/j;->COMPLETED_TUTORIAL:Lk4/j;

    invoke-static {v1, v2}, Lck/r;->a(Ljava/lang/Object;Ljava/lang/Object;)Lck/m;

    move-result-object v1

    const/16 v2, 0xd

    aput-object v1, v0, v2

    invoke-static {v0}, Ldk/h0;->k([Lck/m;)Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lk4/e;->d:Ljava/util/Map;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;)",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v2, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-interface {v2, v1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private final c(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    sget-object p1, Lk4/i;->EVENT_NAME:Lk4/i;

    invoke-virtual {p1}, Lk4/i;->h()Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lk4/n;->MOBILE_APP_INSTALL:Lk4/n;

    invoke-virtual {v1}, Lk4/n;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lk4/i;->EVENT_TIME:Lk4/i;

    invoke-virtual {p1}, Lk4/i;->h()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ldk/p;->e(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final f(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/Map;)Lk4/a;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/ArrayList<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)",
            "Lk4/a;"
        }
    .end annotation

    sget-object v0, Lk4/n;->EVENT:Lk4/n;

    invoke-virtual {v0}, Lk4/n;->h()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lk4/a;->Companion:Lk4/a$a;

    if-eqz v0, :cond_5

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v1, v0}, Lk4/a$a;->a(Ljava/lang/String;)Lk4/a;

    move-result-object v0

    sget-object v1, Lk4/a;->OTHER:Lk4/a;

    if-ne v0, v1, :cond_0

    return-object v0

    :cond_0
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lk4/b;->Companion:Lk4/b$a;

    invoke-virtual {v3, v2}, Lk4/b$a;->a(Ljava/lang/String;)Lk4/b;

    move-result-object v3

    if-eqz v3, :cond_2

    sget-object v2, Lk4/e;->a:Lk4/e;

    invoke-virtual {v2, p2, p3, v3, v1}, Lk4/e;->g(Ljava/util/Map;Ljava/util/Map;Lk4/b;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    sget-object v3, Lk4/k;->CUSTOM_EVENTS:Lk4/k;

    invoke-virtual {v3}, Lk4/k;->h()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    instance-of v4, v1, Ljava/lang/String;

    sget-object v5, Lk4/a;->CUSTOM:Lk4/a;

    if-ne v0, v5, :cond_3

    if-eqz v3, :cond_3

    if-eqz v4, :cond_3

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Lk4/e;->k(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {p4, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_3
    sget-object v3, Lk4/e$a;->Companion:Lk4/e$a$a;

    invoke-virtual {v3, v2}, Lk4/e$a$a;->a(Ljava/lang/String;)Lk4/e$a;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {p5, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_4
    return-object v0

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string p2, "null cannot be cast to non-null type kotlin.String"

    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final h(Ljava/util/Map;Lk4/b;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lk4/b;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    sget-object v0, Lk4/e;->b:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lk4/e$c;

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lk4/e$c;->a()Lk4/l;

    move-result-object p2

    :goto_0
    if-nez p2, :cond_1

    return-void

    :cond_1
    invoke-virtual {p2}, Lk4/l;->h()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final i(Ljava/util/Map;Lk4/b;Ljava/lang/Object;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lk4/b;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    sget-object v0, Lk4/b;->USER_DATA:Lk4/b;

    if-ne p2, v0, :cond_0

    :try_start_0
    sget-object p2, Lcom/facebook/internal/n0;->a:Lcom/facebook/internal/n0;

    new-instance p2, Lorg/json/JSONObject;

    move-object v0, p3

    check-cast v0, Ljava/lang/String;

    invoke-direct {p2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {p2}, Lcom/facebook/internal/n0;->o(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Map;->putAll(Ljava/util/Map;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    sget-object p2, Lcom/facebook/internal/c0;->e:Lcom/facebook/internal/c0$a;

    sget-object v0, Li4/q0;->APP_EVENTS:Li4/q0;

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p3, v1, v2

    const/4 p3, 0x1

    aput-object p1, v1, p3

    const-string p1, "AppEventsConversionsAPITransformer"

    const-string p3, "\n transformEvents JSONException: \n%s\n%s"

    invoke-virtual {p2, v0, p1, p3, v1}, Lcom/facebook/internal/c0$a;->c(Li4/q0;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    sget-object v0, Lk4/e;->b:Ljava/util/Map;

    invoke-interface {v0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lk4/e$c;

    if-nez p2, :cond_1

    const/4 p2, 0x0

    goto :goto_0

    :cond_1
    invoke-virtual {p2}, Lk4/e$c;->a()Lk4/l;

    move-result-object p2

    :goto_0
    if-nez p2, :cond_2

    return-void

    :cond_2
    invoke-virtual {p2}, Lk4/l;->h()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, p2, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    return-void
.end method

.method private final j(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    sget-object v0, Lk4/e;->d:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk4/j;

    if-nez p1, :cond_0

    const-string p1, ""

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lk4/j;->h()Ljava/lang/String;

    move-result-object p1

    :cond_1
    :goto_0
    return-object p1
.end method

.method public static final k(Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/ArrayList<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    const-string v0, "AppEventsConversionsAPITransformer"

    const-string v1, "appEvents"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    :try_start_0
    sget-object v5, Lcom/facebook/internal/n0;->a:Lcom/facebook/internal/n0;

    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, p0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Lcom/facebook/internal/n0;->n(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    sget-object v7, Lcom/facebook/internal/n0;->a:Lcom/facebook/internal/n0;

    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v7}, Lcom/facebook/internal/n0;->o(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_1

    return-object v2

    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-direct {v6}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    sget-object v9, Lk4/m;->Companion:Lk4/m$a;

    invoke-virtual {v9, v8}, Lk4/m$a;->a(Ljava/lang/String;)Lk4/m;

    move-result-object v9

    sget-object v10, Lk4/e;->c:Ljava/util/Map;

    invoke-interface {v10, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lk4/e$b;

    if-eqz v9, :cond_2

    if-nez v10, :cond_3

    goto :goto_2

    :cond_3
    invoke-virtual {v10}, Lk4/e$b;->b()Lk4/k;

    move-result-object v11

    const-string v12, "null cannot be cast to non-null type kotlin.Any"

    if-eqz v11, :cond_6

    sget-object v9, Lk4/k;->CUSTOM_DATA:Lk4/k;

    if-ne v11, v9, :cond_2

    invoke-virtual {v10}, Lk4/e$b;->a()Lk4/i;

    move-result-object v9

    invoke-virtual {v9}, Lk4/i;->h()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-eqz v10, :cond_5

    invoke-static {v8, v10}, Lk4/e;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-interface {v5, v9, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_4
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v12}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v12}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    :try_start_1
    invoke-virtual {v10}, Lk4/e$b;->a()Lk4/i;

    move-result-object v10

    invoke-virtual {v10}, Lk4/i;->h()Ljava/lang/String;

    move-result-object v10

    sget-object v11, Lk4/m;->EVENT_NAME:Lk4/m;

    if-ne v9, v11, :cond_8

    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    if-eqz v11, :cond_8

    sget-object v9, Lk4/e;->a:Lk4/e;

    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_7

    check-cast v8, Ljava/lang/String;

    invoke-direct {v9, v8}, Lk4/e;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    :goto_3
    invoke-interface {v6, v10, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_7
    new-instance v8, Ljava/lang/NullPointerException;

    const-string v9, "null cannot be cast to non-null type kotlin.String"

    invoke-direct {v8, v9}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v8

    :cond_8
    sget-object v11, Lk4/m;->EVENT_TIME:Lk4/m;

    if-ne v9, v11, :cond_2

    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    if-eqz v9, :cond_2

    invoke-interface {v2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    if-eqz v9, :cond_a

    invoke-static {v8, v9}, Lk4/e;->l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    if-eqz v8, :cond_9

    goto :goto_3

    :cond_9
    new-instance v8, Ljava/lang/NullPointerException;

    invoke-direct {v8, v12}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v8

    :cond_a
    new-instance v8, Ljava/lang/NullPointerException;

    invoke-direct {v8, v12}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v8
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v8

    sget-object v9, Lcom/facebook/internal/c0;->e:Lcom/facebook/internal/c0$a;

    sget-object v10, Li4/q0;->APP_EVENTS:Li4/q0;

    new-array v11, v4, [Ljava/lang/Object;

    invoke-static {v8}, Lck/a;->b(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v8

    aput-object v8, v11, v3

    const-string v8, "\n transformEvents ClassCastException: \n %s "

    invoke-virtual {v9, v10, v0, v8, v11}, Lcom/facebook/internal/c0$a;->c(Li4/q0;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_b
    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    xor-int/2addr v2, v4

    if-eqz v2, :cond_c

    sget-object v2, Lk4/k;->CUSTOM_DATA:Lk4/k;

    invoke-virtual {v2}, Lk4/k;->h()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v6, v2, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_c
    invoke-virtual {p0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_d
    return-object p0

    :catch_1
    move-exception v1

    sget-object v5, Lcom/facebook/internal/c0;->e:Lcom/facebook/internal/c0$a;

    sget-object v6, Li4/q0;->APP_EVENTS:Li4/q0;

    const/4 v7, 0x2

    new-array v7, v7, [Ljava/lang/Object;

    aput-object p0, v7, v3

    aput-object v1, v7, v4

    const-string p0, "\n transformEvents JSONException: \n%s\n%s"

    invoke-virtual {v5, v6, v0, p0, v7}, Lcom/facebook/internal/c0$a;->c(Li4/q0;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v2
.end method

.method public static final l(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    const-string v0, "field"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lk4/e$d;->Companion:Lk4/e$d$a;

    invoke-virtual {v0, p0}, Lk4/e$d$a;->a(Ljava/lang/String;)Lk4/e$d;

    move-result-object p0

    instance-of v0, p1, Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz p0, :cond_8

    if-nez v0, :cond_1

    goto/16 :goto_3

    :cond_1
    sget-object v2, Lk4/e$e;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v2, p0

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eq p0, v4, :cond_6

    if-eq p0, v3, :cond_3

    const/4 v0, 0x3

    if-ne p0, v0, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lxk/g;->i(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_2
    new-instance p0, Lck/l;

    invoke-direct {p0}, Lck/l;-><init>()V

    throw p0

    :cond_3
    invoke-static {v0}, Lxk/g;->i(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    if-eqz p0, :cond_4

    move v2, v4

    :cond_4
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    :cond_5
    return-object v1

    :cond_6
    :try_start_0
    sget-object p0, Lcom/facebook/internal/n0;->a:Lcom/facebook/internal/n0;

    new-instance p0, Lorg/json/JSONArray;

    invoke-direct {p0, v0}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-static {p0}, Lcom/facebook/internal/n0;->n(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    sget-object v5, Lcom/facebook/internal/n0;->a:Lcom/facebook/internal/n0;

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Lcom/facebook/internal/n0;->o(Lorg/json/JSONObject;)Ljava/util/Map;

    move-result-object v1
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :catch_0
    :try_start_2
    sget-object v5, Lcom/facebook/internal/n0;->a:Lcom/facebook/internal/n0;

    new-instance v5, Lorg/json/JSONArray;

    invoke-direct {v5, v1}, Lorg/json/JSONArray;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Lcom/facebook/internal/n0;->n(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v1
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :goto_2
    :try_start_3
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Lorg/json/JSONException; {:try_start_3 .. :try_end_3} :catch_2

    goto :goto_1

    :cond_7
    return-object v0

    :catch_2
    move-exception p0

    sget-object v0, Lcom/facebook/internal/c0;->e:Lcom/facebook/internal/c0$a;

    sget-object v1, Li4/q0;->APP_EVENTS:Li4/q0;

    new-array v3, v3, [Ljava/lang/Object;

    aput-object p1, v3, v2

    aput-object p0, v3, v4

    const-string p0, "AppEventsConversionsAPITransformer"

    const-string p1, "\n transformEvents JSONException: \n%s\n%s"

    invoke-virtual {v0, v1, p0, p1, v3}, Lcom/facebook/internal/c0$a;->c(Li4/q0;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    sget-object p0, Lck/v;->a:Lck/v;

    return-object p0

    :cond_8
    :goto_3
    return-object p1
.end method


# virtual methods
.method public final a(Lk4/a;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk4/a;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;>;",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    const-string v0, "eventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restOfData"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "customEvents"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p2, p3, p4}, Lk4/e;->d(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p2

    sget-object p3, Lk4/e$e;->c:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    const/4 p3, 0x1

    if-eq p1, p3, :cond_1

    const/4 p3, 0x2

    if-eq p1, p3, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-direct {p0, p2, p5}, Lk4/e;->b(Ljava/util/Map;Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-direct {p0, p2, p6}, Lk4/e;->c(Ljava/util/Map;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final d(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "userData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "restOfData"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sget-object v1, Lk4/n;->ACTION_SOURCE:Lk4/n;

    invoke-virtual {v1}, Lk4/n;->h()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lk4/n;->APP:Lk4/n;

    invoke-virtual {v2}, Lk4/n;->h()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lk4/k;->USER_DATA:Lk4/k;

    invoke-virtual {v1}, Lk4/k;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lk4/k;->APP_DATA:Lk4/k;

    invoke-virtual {p1}, Lk4/k;->h()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0, p3}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object v0
.end method

.method public final e(Ljava/util/Map;)Ljava/util/List;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;>;"
        }
    .end annotation

    const-string v0, "parameters"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    move-object v1, p0

    move-object v2, p1

    move-object v3, v0

    move-object v4, v7

    move-object v5, v8

    move-object v6, v9

    invoke-direct/range {v1 .. v6}, Lk4/e;->f(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/ArrayList;Ljava/util/Map;)Lk4/a;

    move-result-object v2

    sget-object v1, Lk4/a;->OTHER:Lk4/a;

    if-ne v2, v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    sget-object v1, Lk4/n;->INSTALL_EVENT_TIME:Lk4/n;

    invoke-virtual {v1}, Lk4/n;->h()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p0

    move-object v3, v0

    move-object v4, v7

    move-object v5, v9

    move-object v6, v8

    move-object v7, p1

    invoke-virtual/range {v1 .. v7}, Lk4/e;->a(Lk4/a;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/util/Map;Ljava/util/Map;Lk4/b;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;",
            "Lk4/b;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    const-string v0, "userData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appData"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "field"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lk4/e;->b:Ljava/util/Map;

    invoke-interface {v0, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk4/e$c;

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {v0}, Lk4/e$c;->b()Lk4/k;

    move-result-object v0

    sget-object v1, Lk4/e$e;->b:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 p2, 0x2

    if-eq v0, p2, :cond_1

    return-void

    :cond_1
    invoke-direct {p0, p1, p3, p4}, Lk4/e;->i(Ljava/util/Map;Lk4/b;Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-direct {p0, p2, p3, p4}, Lk4/e;->h(Ljava/util/Map;Lk4/b;Ljava/lang/Object;)V

    :goto_0
    return-void
.end method
