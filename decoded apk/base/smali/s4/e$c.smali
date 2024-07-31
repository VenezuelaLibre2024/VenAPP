.class public final enum Ls4/e$c;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls4/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ls4/e$c;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ls4/e$c;

.field public static final enum OPERATION_SUCCESS:Ls4/e$c;

.field public static final enum SERVICE_ERROR:Ls4/e$c;

.field public static final enum SERVICE_NOT_AVAILABLE:Ls4/e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ls4/e$c;

    const-string v1, "OPERATION_SUCCESS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ls4/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls4/e$c;->OPERATION_SUCCESS:Ls4/e$c;

    new-instance v0, Ls4/e$c;

    const-string v1, "SERVICE_NOT_AVAILABLE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ls4/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls4/e$c;->SERVICE_NOT_AVAILABLE:Ls4/e$c;

    new-instance v0, Ls4/e$c;

    const-string v1, "SERVICE_ERROR"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ls4/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls4/e$c;->SERVICE_ERROR:Ls4/e$c;

    invoke-static {}, Ls4/e$c;->b()[Ls4/e$c;

    move-result-object v0

    sput-object v0, Ls4/e$c;->$VALUES:[Ls4/e$c;

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

.method private static final synthetic b()[Ls4/e$c;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ls4/e$c;

    const/4 v1, 0x0

    sget-object v2, Ls4/e$c;->OPERATION_SUCCESS:Ls4/e$c;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ls4/e$c;->SERVICE_NOT_AVAILABLE:Ls4/e$c;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Ls4/e$c;->SERVICE_ERROR:Ls4/e$c;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ls4/e$c;
    .locals 1

    const-string v0, "value"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Ls4/e$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls4/e$c;

    return-object p0
.end method

.method public static values()[Ls4/e$c;
    .locals 2

    sget-object v0, Ls4/e$c;->$VALUES:[Ls4/e$c;

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls4/e$c;

    return-object v0
.end method
