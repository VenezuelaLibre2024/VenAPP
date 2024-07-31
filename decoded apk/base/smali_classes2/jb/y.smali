.class public final Ljb/y;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Ljb/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljb/y;

    invoke-direct {v0}, Ljb/y;-><init>()V

    sput-object v0, Ljb/y;->a:Ljb/y;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a()Ljb/y;
    .locals 1

    sget-object v0, Ljb/y;->a:Ljb/y;

    return-object v0
.end method

.method public static b(Ljb/y;)Ljb/y;
    .locals 1

    if-eqz p0, :cond_0

    return-object p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "SecretKeyAccess is required"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
