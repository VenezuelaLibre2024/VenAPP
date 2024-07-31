.class public final enum Lcom/arthenica/ffmpegkit/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/arthenica/ffmpegkit/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/arthenica/ffmpegkit/a;

.field public static final enum ABI_ARM:Lcom/arthenica/ffmpegkit/a;

.field public static final enum ABI_ARM64_V8A:Lcom/arthenica/ffmpegkit/a;

.field public static final enum ABI_ARMV7A:Lcom/arthenica/ffmpegkit/a;

.field public static final enum ABI_ARMV7A_NEON:Lcom/arthenica/ffmpegkit/a;

.field public static final enum ABI_UNKNOWN:Lcom/arthenica/ffmpegkit/a;

.field public static final enum ABI_X86:Lcom/arthenica/ffmpegkit/a;

.field public static final enum ABI_X86_64:Lcom/arthenica/ffmpegkit/a;


# instance fields
.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/arthenica/ffmpegkit/a;

    const/4 v1, 0x0

    const-string v2, "armeabi-v7a-neon"

    const-string v3, "ABI_ARMV7A_NEON"

    invoke-direct {v0, v3, v1, v2}, Lcom/arthenica/ffmpegkit/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/arthenica/ffmpegkit/a;->ABI_ARMV7A_NEON:Lcom/arthenica/ffmpegkit/a;

    new-instance v0, Lcom/arthenica/ffmpegkit/a;

    const/4 v1, 0x1

    const-string v2, "armeabi-v7a"

    const-string v3, "ABI_ARMV7A"

    invoke-direct {v0, v3, v1, v2}, Lcom/arthenica/ffmpegkit/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/arthenica/ffmpegkit/a;->ABI_ARMV7A:Lcom/arthenica/ffmpegkit/a;

    new-instance v0, Lcom/arthenica/ffmpegkit/a;

    const/4 v1, 0x2

    const-string v2, "armeabi"

    const-string v3, "ABI_ARM"

    invoke-direct {v0, v3, v1, v2}, Lcom/arthenica/ffmpegkit/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/arthenica/ffmpegkit/a;->ABI_ARM:Lcom/arthenica/ffmpegkit/a;

    new-instance v0, Lcom/arthenica/ffmpegkit/a;

    const/4 v1, 0x3

    const-string v2, "x86"

    const-string v3, "ABI_X86"

    invoke-direct {v0, v3, v1, v2}, Lcom/arthenica/ffmpegkit/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/arthenica/ffmpegkit/a;->ABI_X86:Lcom/arthenica/ffmpegkit/a;

    new-instance v0, Lcom/arthenica/ffmpegkit/a;

    const/4 v1, 0x4

    const-string v2, "x86_64"

    const-string v3, "ABI_X86_64"

    invoke-direct {v0, v3, v1, v2}, Lcom/arthenica/ffmpegkit/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/arthenica/ffmpegkit/a;->ABI_X86_64:Lcom/arthenica/ffmpegkit/a;

    new-instance v0, Lcom/arthenica/ffmpegkit/a;

    const/4 v1, 0x5

    const-string v2, "arm64-v8a"

    const-string v3, "ABI_ARM64_V8A"

    invoke-direct {v0, v3, v1, v2}, Lcom/arthenica/ffmpegkit/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/arthenica/ffmpegkit/a;->ABI_ARM64_V8A:Lcom/arthenica/ffmpegkit/a;

    new-instance v0, Lcom/arthenica/ffmpegkit/a;

    const/4 v1, 0x6

    const-string v2, "unknown"

    const-string v3, "ABI_UNKNOWN"

    invoke-direct {v0, v3, v1, v2}, Lcom/arthenica/ffmpegkit/a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/arthenica/ffmpegkit/a;->ABI_UNKNOWN:Lcom/arthenica/ffmpegkit/a;

    invoke-static {}, Lcom/arthenica/ffmpegkit/a;->b()[Lcom/arthenica/ffmpegkit/a;

    move-result-object v0

    sput-object v0, Lcom/arthenica/ffmpegkit/a;->$VALUES:[Lcom/arthenica/ffmpegkit/a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/arthenica/ffmpegkit/a;->name:Ljava/lang/String;

    return-void
.end method

.method private static synthetic b()[Lcom/arthenica/ffmpegkit/a;
    .locals 3

    const/4 v0, 0x7

    new-array v0, v0, [Lcom/arthenica/ffmpegkit/a;

    const/4 v1, 0x0

    sget-object v2, Lcom/arthenica/ffmpegkit/a;->ABI_ARMV7A_NEON:Lcom/arthenica/ffmpegkit/a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/arthenica/ffmpegkit/a;->ABI_ARMV7A:Lcom/arthenica/ffmpegkit/a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lcom/arthenica/ffmpegkit/a;->ABI_ARM:Lcom/arthenica/ffmpegkit/a;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lcom/arthenica/ffmpegkit/a;->ABI_X86:Lcom/arthenica/ffmpegkit/a;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lcom/arthenica/ffmpegkit/a;->ABI_X86_64:Lcom/arthenica/ffmpegkit/a;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lcom/arthenica/ffmpegkit/a;->ABI_ARM64_V8A:Lcom/arthenica/ffmpegkit/a;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/arthenica/ffmpegkit/a;->ABI_UNKNOWN:Lcom/arthenica/ffmpegkit/a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/arthenica/ffmpegkit/a;
    .locals 1

    const-class v0, Lcom/arthenica/ffmpegkit/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/arthenica/ffmpegkit/a;

    return-object p0
.end method

.method public static values()[Lcom/arthenica/ffmpegkit/a;
    .locals 1

    sget-object v0, Lcom/arthenica/ffmpegkit/a;->$VALUES:[Lcom/arthenica/ffmpegkit/a;

    invoke-virtual {v0}, [Lcom/arthenica/ffmpegkit/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/arthenica/ffmpegkit/a;

    return-object v0
.end method


# virtual methods
.method public h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/arthenica/ffmpegkit/a;->name:Ljava/lang/String;

    return-object v0
.end method
