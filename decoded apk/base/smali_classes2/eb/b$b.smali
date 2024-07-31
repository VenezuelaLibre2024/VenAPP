.class final enum Leb/b$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Leb/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Leb/b$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Leb/b$b;

.field public static final enum DONE:Leb/b$b;

.field public static final enum FAILED:Leb/b$b;

.field public static final enum NOT_READY:Leb/b$b;

.field public static final enum READY:Leb/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Leb/b$b;

    const-string v1, "READY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Leb/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leb/b$b;->READY:Leb/b$b;

    new-instance v0, Leb/b$b;

    const-string v1, "NOT_READY"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Leb/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leb/b$b;->NOT_READY:Leb/b$b;

    new-instance v0, Leb/b$b;

    const-string v1, "DONE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Leb/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leb/b$b;->DONE:Leb/b$b;

    new-instance v0, Leb/b$b;

    const-string v1, "FAILED"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Leb/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Leb/b$b;->FAILED:Leb/b$b;

    invoke-static {}, Leb/b$b;->b()[Leb/b$b;

    move-result-object v0

    sput-object v0, Leb/b$b;->$VALUES:[Leb/b$b;

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

.method private static synthetic b()[Leb/b$b;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Leb/b$b;

    const/4 v1, 0x0

    sget-object v2, Leb/b$b;->READY:Leb/b$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Leb/b$b;->NOT_READY:Leb/b$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Leb/b$b;->DONE:Leb/b$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Leb/b$b;->FAILED:Leb/b$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Leb/b$b;
    .locals 1

    const-class v0, Leb/b$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Leb/b$b;

    return-object p0
.end method

.method public static values()[Leb/b$b;
    .locals 1

    sget-object v0, Leb/b$b;->$VALUES:[Leb/b$b;

    invoke-virtual {v0}, [Leb/b$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Leb/b$b;

    return-object v0
.end method
