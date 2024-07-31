.class public final enum Lf2/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lf2/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lf2/d;

.field public static final enum APPEND:Lf2/d;

.field public static final enum APPEND_OR_REPLACE:Lf2/d;

.field public static final enum KEEP:Lf2/d;

.field public static final enum REPLACE:Lf2/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lf2/d;

    const-string v1, "REPLACE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lf2/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/d;->REPLACE:Lf2/d;

    new-instance v0, Lf2/d;

    const-string v1, "KEEP"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lf2/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/d;->KEEP:Lf2/d;

    new-instance v0, Lf2/d;

    const-string v1, "APPEND"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lf2/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/d;->APPEND:Lf2/d;

    new-instance v0, Lf2/d;

    const-string v1, "APPEND_OR_REPLACE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lf2/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lf2/d;->APPEND_OR_REPLACE:Lf2/d;

    invoke-static {}, Lf2/d;->b()[Lf2/d;

    move-result-object v0

    sput-object v0, Lf2/d;->$VALUES:[Lf2/d;

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

.method private static final synthetic b()[Lf2/d;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Lf2/d;

    const/4 v1, 0x0

    sget-object v2, Lf2/d;->REPLACE:Lf2/d;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lf2/d;->KEEP:Lf2/d;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lf2/d;->APPEND:Lf2/d;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lf2/d;->APPEND_OR_REPLACE:Lf2/d;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lf2/d;
    .locals 1

    const-class v0, Lf2/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lf2/d;

    return-object p0
.end method

.method public static values()[Lf2/d;
    .locals 1

    sget-object v0, Lf2/d;->$VALUES:[Lf2/d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lf2/d;

    return-object v0
.end method
