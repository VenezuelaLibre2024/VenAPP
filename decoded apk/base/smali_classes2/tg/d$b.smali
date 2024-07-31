.class final enum Ltg/d$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltg/d$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ltg/d$b;

.field public static final enum FNC_1:Ltg/d$b;

.field public static final enum ONE_DIGIT:Ltg/d$b;

.field public static final enum TWO_DIGITS:Ltg/d$b;

.field public static final enum UNCODABLE:Ltg/d$b;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Ltg/d$b;

    const-string v1, "UNCODABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltg/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltg/d$b;->UNCODABLE:Ltg/d$b;

    new-instance v1, Ltg/d$b;

    const-string v3, "ONE_DIGIT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ltg/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ltg/d$b;->ONE_DIGIT:Ltg/d$b;

    new-instance v3, Ltg/d$b;

    const-string v5, "TWO_DIGITS"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ltg/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ltg/d$b;->TWO_DIGITS:Ltg/d$b;

    new-instance v5, Ltg/d$b;

    const-string v7, "FNC_1"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Ltg/d$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ltg/d$b;->FNC_1:Ltg/d$b;

    const/4 v7, 0x4

    new-array v7, v7, [Ltg/d$b;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Ltg/d$b;->$VALUES:[Ltg/d$b;

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

.method public static valueOf(Ljava/lang/String;)Ltg/d$b;
    .locals 1

    const-class v0, Ltg/d$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltg/d$b;

    return-object p0
.end method

.method public static values()[Ltg/d$b;
    .locals 1

    sget-object v0, Ltg/d$b;->$VALUES:[Ltg/d$b;

    invoke-virtual {v0}, [Ltg/d$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltg/d$b;

    return-object v0
.end method
