.class public final enum Lxj/f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lxj/f;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lxj/f;

.field public static final enum BOUNDARY:Lxj/f;

.field public static final enum END:Lxj/f;

.field public static final enum IMMEDIATE:Lxj/f;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lxj/f;

    const-string v1, "IMMEDIATE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lxj/f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lxj/f;->IMMEDIATE:Lxj/f;

    new-instance v1, Lxj/f;

    const-string v3, "BOUNDARY"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lxj/f;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lxj/f;->BOUNDARY:Lxj/f;

    new-instance v3, Lxj/f;

    const-string v5, "END"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lxj/f;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lxj/f;->END:Lxj/f;

    const/4 v5, 0x3

    new-array v5, v5, [Lxj/f;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lxj/f;->$VALUES:[Lxj/f;

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

.method public static valueOf(Ljava/lang/String;)Lxj/f;
    .locals 1

    const-class v0, Lxj/f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lxj/f;

    return-object p0
.end method

.method public static values()[Lxj/f;
    .locals 1

    sget-object v0, Lxj/f;->$VALUES:[Lxj/f;

    invoke-virtual {v0}, [Lxj/f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxj/f;

    return-object v0
.end method
