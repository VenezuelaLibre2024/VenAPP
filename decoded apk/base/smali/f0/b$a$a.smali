.class public final enum Lf0/b$a$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf0/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf0/b$a$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lf0/b$a$a;

.field public static final enum DECODE_FAILED:Lf0/b$a$a;

.field public static final enum ENCODE_FAILED:Lf0/b$a$a;

.field public static final enum UNKNOWN:Lf0/b$a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf0/b$a$a;

    const-string v1, "ENCODE_FAILED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf0/b$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf0/b$a$a;->ENCODE_FAILED:Lf0/b$a$a;

    new-instance v0, Lf0/b$a$a;

    const-string v1, "DECODE_FAILED"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf0/b$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf0/b$a$a;->DECODE_FAILED:Lf0/b$a$a;

    new-instance v0, Lf0/b$a$a;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lf0/b$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf0/b$a$a;->UNKNOWN:Lf0/b$a$a;

    invoke-static {}, Lf0/b$a$a;->b()[Lf0/b$a$a;

    move-result-object v0

    sput-object v0, Lf0/b$a$a;->$VALUES:[Lf0/b$a$a;

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

.method private static synthetic b()[Lf0/b$a$a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Lf0/b$a$a;

    const/4 v1, 0x0

    sget-object v2, Lf0/b$a$a;->ENCODE_FAILED:Lf0/b$a$a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lf0/b$a$a;->DECODE_FAILED:Lf0/b$a$a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lf0/b$a$a;->UNKNOWN:Lf0/b$a$a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf0/b$a$a;
    .locals 1

    const-class v0, Lf0/b$a$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf0/b$a$a;

    return-object p0
.end method

.method public static values()[Lf0/b$a$a;
    .locals 1

    sget-object v0, Lf0/b$a$a;->$VALUES:[Lf0/b$a$a;

    invoke-virtual {v0}, [Lf0/b$a$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf0/b$a$a;

    return-object v0
.end method
