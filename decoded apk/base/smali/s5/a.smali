.class public final enum Ls5/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ls5/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lik/a;

.field private static final synthetic $VALUES:[Ls5/a;

.field public static final enum Audio:Ls5/a;

.field public static final enum Image:Ls5/a;

.field public static final enum Video:Ls5/a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ls5/a;

    const-string v1, "Image"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ls5/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls5/a;->Image:Ls5/a;

    new-instance v0, Ls5/a;

    const-string v1, "Video"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Ls5/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls5/a;->Video:Ls5/a;

    new-instance v0, Ls5/a;

    const-string v1, "Audio"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Ls5/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ls5/a;->Audio:Ls5/a;

    invoke-static {}, Ls5/a;->b()[Ls5/a;

    move-result-object v0

    sput-object v0, Ls5/a;->$VALUES:[Ls5/a;

    invoke-static {v0}, Lik/b;->a([Ljava/lang/Enum;)Lik/a;

    move-result-object v0

    sput-object v0, Ls5/a;->$ENTRIES:Lik/a;

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

.method private static final synthetic b()[Ls5/a;
    .locals 3

    const/4 v0, 0x3

    new-array v0, v0, [Ls5/a;

    const/4 v1, 0x0

    sget-object v2, Ls5/a;->Image:Ls5/a;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Ls5/a;->Video:Ls5/a;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Ls5/a;->Audio:Ls5/a;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Ls5/a;
    .locals 1

    const-class v0, Ls5/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ls5/a;

    return-object p0
.end method

.method public static values()[Ls5/a;
    .locals 1

    sget-object v0, Ls5/a;->$VALUES:[Ls5/a;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ls5/a;

    return-object v0
.end method
