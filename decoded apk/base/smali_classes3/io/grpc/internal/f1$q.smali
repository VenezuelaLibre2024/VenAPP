.class final enum Lio/grpc/internal/f1$q;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4018
    name = "q"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/grpc/internal/f1$q;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/grpc/internal/f1$q;

.field public static final enum ERROR:Lio/grpc/internal/f1$q;

.field public static final enum NO_RESOLUTION:Lio/grpc/internal/f1$q;

.field public static final enum SUCCESS:Lio/grpc/internal/f1$q;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lio/grpc/internal/f1$q;

    const-string v1, "NO_RESOLUTION"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/grpc/internal/f1$q;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/grpc/internal/f1$q;->NO_RESOLUTION:Lio/grpc/internal/f1$q;

    new-instance v1, Lio/grpc/internal/f1$q;

    const-string v3, "SUCCESS"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lio/grpc/internal/f1$q;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/grpc/internal/f1$q;->SUCCESS:Lio/grpc/internal/f1$q;

    new-instance v3, Lio/grpc/internal/f1$q;

    const-string v5, "ERROR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lio/grpc/internal/f1$q;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lio/grpc/internal/f1$q;->ERROR:Lio/grpc/internal/f1$q;

    const/4 v5, 0x3

    new-array v5, v5, [Lio/grpc/internal/f1$q;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lio/grpc/internal/f1$q;->$VALUES:[Lio/grpc/internal/f1$q;

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

.method public static valueOf(Ljava/lang/String;)Lio/grpc/internal/f1$q;
    .locals 1

    const-class v0, Lio/grpc/internal/f1$q;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/grpc/internal/f1$q;

    return-object p0
.end method

.method public static values()[Lio/grpc/internal/f1$q;
    .locals 1

    sget-object v0, Lio/grpc/internal/f1$q;->$VALUES:[Lio/grpc/internal/f1$q;

    invoke-virtual {v0}, [Lio/grpc/internal/f1$q;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/grpc/internal/f1$q;

    return-object v0
.end method
