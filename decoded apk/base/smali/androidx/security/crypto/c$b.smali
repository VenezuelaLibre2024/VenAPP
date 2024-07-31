.class public final enum Landroidx/security/crypto/c$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/security/crypto/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Landroidx/security/crypto/c$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Landroidx/security/crypto/c$b;

.field public static final enum AES256_GCM:Landroidx/security/crypto/c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Landroidx/security/crypto/c$b;

    const-string v1, "AES256_GCM"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Landroidx/security/crypto/c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Landroidx/security/crypto/c$b;->AES256_GCM:Landroidx/security/crypto/c$b;

    invoke-static {}, Landroidx/security/crypto/c$b;->b()[Landroidx/security/crypto/c$b;

    move-result-object v0

    sput-object v0, Landroidx/security/crypto/c$b;->$VALUES:[Landroidx/security/crypto/c$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic b()[Landroidx/security/crypto/c$b;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Landroidx/security/crypto/c$b;

    const/4 v1, 0x0

    sget-object v2, Landroidx/security/crypto/c$b;->AES256_GCM:Landroidx/security/crypto/c$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Landroidx/security/crypto/c$b;
    .locals 1

    const-class v0, Landroidx/security/crypto/c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Landroidx/security/crypto/c$b;

    return-object p0
.end method

.method public static values()[Landroidx/security/crypto/c$b;
    .locals 1

    sget-object v0, Landroidx/security/crypto/c$b;->$VALUES:[Landroidx/security/crypto/c$b;

    invoke-virtual {v0}, [Landroidx/security/crypto/c$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroidx/security/crypto/c$b;

    return-object v0
.end method
