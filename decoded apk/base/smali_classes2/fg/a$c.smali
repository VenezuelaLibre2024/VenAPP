.class final enum Lfg/a$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfg/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lfg/a$c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lfg/a$c;

.field public static final enum BINARY:Lfg/a$c;

.field public static final enum DIGIT:Lfg/a$c;

.field public static final enum LOWER:Lfg/a$c;

.field public static final enum MIXED:Lfg/a$c;

.field public static final enum PUNCT:Lfg/a$c;

.field public static final enum UPPER:Lfg/a$c;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lfg/a$c;

    const-string v1, "UPPER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lfg/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lfg/a$c;->UPPER:Lfg/a$c;

    new-instance v1, Lfg/a$c;

    const-string v3, "LOWER"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lfg/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lfg/a$c;->LOWER:Lfg/a$c;

    new-instance v3, Lfg/a$c;

    const-string v5, "MIXED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lfg/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lfg/a$c;->MIXED:Lfg/a$c;

    new-instance v5, Lfg/a$c;

    const-string v7, "DIGIT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lfg/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lfg/a$c;->DIGIT:Lfg/a$c;

    new-instance v7, Lfg/a$c;

    const-string v9, "PUNCT"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lfg/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lfg/a$c;->PUNCT:Lfg/a$c;

    new-instance v9, Lfg/a$c;

    const-string v11, "BINARY"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lfg/a$c;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lfg/a$c;->BINARY:Lfg/a$c;

    const/4 v11, 0x6

    new-array v11, v11, [Lfg/a$c;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lfg/a$c;->$VALUES:[Lfg/a$c;

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

.method public static valueOf(Ljava/lang/String;)Lfg/a$c;
    .locals 1

    const-class v0, Lfg/a$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lfg/a$c;

    return-object p0
.end method

.method public static values()[Lfg/a$c;
    .locals 1

    sget-object v0, Lfg/a$c;->$VALUES:[Lfg/a$c;

    invoke-virtual {v0}, [Lfg/a$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lfg/a$c;

    return-object v0
.end method
