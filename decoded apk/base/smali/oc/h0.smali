.class public final Loc/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lga/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lga/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "GetTokenResultFactory"

    invoke-direct {v0, v2, v1}, Lga/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, Loc/h0;->a:Lga/a;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/google/firebase/auth/c0;
    .locals 4

    :try_start_0
    invoke-static {p0}, Loc/j0;->b(Ljava/lang/String;)Ljava/util/Map;

    move-result-object v0
    :try_end_0
    .catch Lcom/google/android/gms/internal/firebase-auth-api/zzxw; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Loc/h0;->a:Lga/a;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Error parsing token claims"

    invoke-virtual {v1, v3, v0, v2}, Lga/a;->b(Ljava/lang/String;Ljava/lang/Throwable;[Ljava/lang/Object;)V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :goto_0
    new-instance v1, Lcom/google/firebase/auth/c0;

    invoke-direct {v1, p0, v0}, Lcom/google/firebase/auth/c0;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    return-object v1
.end method
