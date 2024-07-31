.class public final enum Lql/f0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lql/f0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lql/f0;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lql/f0;

.field public static final Companion:Lql/f0$a;

.field public static final enum SSL_3_0:Lql/f0;

.field public static final enum TLS_1_0:Lql/f0;

.field public static final enum TLS_1_1:Lql/f0;

.field public static final enum TLS_1_2:Lql/f0;

.field public static final enum TLS_1_3:Lql/f0;


# instance fields
.field private final javaName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lql/f0;

    const/4 v1, 0x0

    const-string v2, "TLSv1.3"

    const-string v3, "TLS_1_3"

    invoke-direct {v0, v3, v1, v2}, Lql/f0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lql/f0;->TLS_1_3:Lql/f0;

    new-instance v0, Lql/f0;

    const/4 v1, 0x1

    const-string v2, "TLSv1.2"

    const-string v3, "TLS_1_2"

    invoke-direct {v0, v3, v1, v2}, Lql/f0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lql/f0;->TLS_1_2:Lql/f0;

    new-instance v0, Lql/f0;

    const/4 v1, 0x2

    const-string v2, "TLSv1.1"

    const-string v3, "TLS_1_1"

    invoke-direct {v0, v3, v1, v2}, Lql/f0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lql/f0;->TLS_1_1:Lql/f0;

    new-instance v0, Lql/f0;

    const/4 v1, 0x3

    const-string v2, "TLSv1"

    const-string v3, "TLS_1_0"

    invoke-direct {v0, v3, v1, v2}, Lql/f0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lql/f0;->TLS_1_0:Lql/f0;

    new-instance v0, Lql/f0;

    const/4 v1, 0x4

    const-string v2, "SSLv3"

    const-string v3, "SSL_3_0"

    invoke-direct {v0, v3, v1, v2}, Lql/f0;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lql/f0;->SSL_3_0:Lql/f0;

    invoke-static {}, Lql/f0;->b()[Lql/f0;

    move-result-object v0

    sput-object v0, Lql/f0;->$VALUES:[Lql/f0;

    new-instance v0, Lql/f0$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lql/f0$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lql/f0;->Companion:Lql/f0$a;

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

    iput-object p3, p0, Lql/f0;->javaName:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic b()[Lql/f0;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lql/f0;

    const/4 v1, 0x0

    sget-object v2, Lql/f0;->TLS_1_3:Lql/f0;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lql/f0;->TLS_1_2:Lql/f0;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lql/f0;->TLS_1_1:Lql/f0;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lql/f0;->TLS_1_0:Lql/f0;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lql/f0;->SSL_3_0:Lql/f0;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lql/f0;
    .locals 1

    const-class v0, Lql/f0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lql/f0;

    return-object p0
.end method

.method public static values()[Lql/f0;
    .locals 1

    sget-object v0, Lql/f0;->$VALUES:[Lql/f0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lql/f0;

    return-object v0
.end method


# virtual methods
.method public final h()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lql/f0;->javaName:Ljava/lang/String;

    return-object v0
.end method
