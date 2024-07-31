.class final enum Ldk/t0;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ldk/t0;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lik/a;

.field private static final synthetic $VALUES:[Ldk/t0;

.field public static final enum Done:Ldk/t0;

.field public static final enum Failed:Ldk/t0;

.field public static final enum NotReady:Ldk/t0;

.field public static final enum Ready:Ldk/t0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ldk/t0;

    const-string v1, "Ready"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ldk/t0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldk/t0;->Ready:Ldk/t0;

    new-instance v0, Ldk/t0;

    const-string v1, "NotReady"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ldk/t0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldk/t0;->NotReady:Ldk/t0;

    new-instance v0, Ldk/t0;

    const-string v1, "Done"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ldk/t0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldk/t0;->Done:Ldk/t0;

    new-instance v0, Ldk/t0;

    const-string v1, "Failed"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Ldk/t0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ldk/t0;->Failed:Ldk/t0;

    invoke-static {}, Ldk/t0;->b()[Ldk/t0;

    move-result-object v0

    sput-object v0, Ldk/t0;->$VALUES:[Ldk/t0;

    invoke-static {v0}, Lik/b;->a([Ljava/lang/Enum;)Lik/a;

    move-result-object v0

    sput-object v0, Ldk/t0;->$ENTRIES:Lik/a;

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

.method private static final synthetic b()[Ldk/t0;
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ldk/t0;

    const/4 v1, 0x0

    sget-object v2, Ldk/t0;->Ready:Ldk/t0;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ldk/t0;->NotReady:Ldk/t0;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Ldk/t0;->Done:Ldk/t0;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Ldk/t0;->Failed:Ldk/t0;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ldk/t0;
    .locals 1

    const-class v0, Ldk/t0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ldk/t0;

    return-object p0
.end method

.method public static values()[Ldk/t0;
    .locals 1

    sget-object v0, Ldk/t0;->$VALUES:[Ldk/t0;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldk/t0;

    return-object v0
.end method
