.class public final enum Lr1/l;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lr1/l;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lr1/l;

.field public static final enum ASC:Lr1/l;

.field public static final enum DESC:Lr1/l;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr1/l;

    const-string v1, "ASC"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr1/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr1/l;->ASC:Lr1/l;

    new-instance v0, Lr1/l;

    const-string v1, "DESC"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lr1/l;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr1/l;->DESC:Lr1/l;

    invoke-static {}, Lr1/l;->b()[Lr1/l;

    move-result-object v0

    sput-object v0, Lr1/l;->$VALUES:[Lr1/l;

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

.method private static final synthetic b()[Lr1/l;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lr1/l;

    const/4 v1, 0x0

    sget-object v2, Lr1/l;->ASC:Lr1/l;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lr1/l;->DESC:Lr1/l;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lr1/l;
    .locals 1

    const-class v0, Lr1/l;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr1/l;

    return-object p0
.end method

.method public static values()[Lr1/l;
    .locals 1

    sget-object v0, Lr1/l;->$VALUES:[Lr1/l;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr1/l;

    return-object v0
.end method