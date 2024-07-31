.class public final enum Lsh/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lsh/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lik/a;

.field private static final synthetic $VALUES:[Lsh/d;

.field public static final enum Current:Lsh/d;

.field public static final enum Max:Lsh/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lsh/d;

    const-string v1, "Current"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lsh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsh/d;->Current:Lsh/d;

    new-instance v0, Lsh/d;

    const-string v1, "Max"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lsh/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lsh/d;->Max:Lsh/d;

    invoke-static {}, Lsh/d;->b()[Lsh/d;

    move-result-object v0

    sput-object v0, Lsh/d;->$VALUES:[Lsh/d;

    invoke-static {v0}, Lik/b;->a([Ljava/lang/Enum;)Lik/a;

    move-result-object v0

    sput-object v0, Lsh/d;->$ENTRIES:Lik/a;

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

.method private static final synthetic b()[Lsh/d;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lsh/d;

    const/4 v1, 0x0

    sget-object v2, Lsh/d;->Current:Lsh/d;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lsh/d;->Max:Lsh/d;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lsh/d;
    .locals 1

    const-class v0, Lsh/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lsh/d;

    return-object p0
.end method

.method public static values()[Lsh/d;
    .locals 1

    sget-object v0, Lsh/d;->$VALUES:[Lsh/d;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lsh/d;

    return-object v0
.end method
