.class public final enum Ldf/i;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Lld/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldf/i;",
        ">;",
        "Lld/f;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ldf/i;

.field public static final enum EVENT_TYPE_UNKNOWN:Ldf/i;

.field public static final enum SESSION_START:Ldf/i;


# instance fields
.field private final number:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ldf/i;

    const-string v1, "EVENT_TYPE_UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Ldf/i;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldf/i;->EVENT_TYPE_UNKNOWN:Ldf/i;

    new-instance v0, Ldf/i;

    const-string v1, "SESSION_START"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v2}, Ldf/i;-><init>(Ljava/lang/String;II)V

    sput-object v0, Ldf/i;->SESSION_START:Ldf/i;

    invoke-static {}, Ldf/i;->b()[Ldf/i;

    move-result-object v0

    sput-object v0, Ldf/i;->$VALUES:[Ldf/i;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Ldf/i;->number:I

    return-void
.end method

.method private static final synthetic b()[Ldf/i;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ldf/i;

    const/4 v1, 0x0

    sget-object v2, Ldf/i;->EVENT_TYPE_UNKNOWN:Ldf/i;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ldf/i;->SESSION_START:Ldf/i;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ldf/i;
    .locals 1

    const-class v0, Ldf/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldf/i;

    return-object p0
.end method

.method public static values()[Ldf/i;
    .locals 1

    sget-object v0, Ldf/i;->$VALUES:[Ldf/i;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldf/i;

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Ldf/i;->number:I

    return v0
.end method
