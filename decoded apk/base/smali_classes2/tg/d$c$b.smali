.class final enum Ltg/d$c$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ltg/d$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ltg/d$c$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ltg/d$c$b;

.field public static final enum A:Ltg/d$c$b;

.field public static final enum B:Ltg/d$c$b;

.field public static final enum C:Ltg/d$c$b;

.field public static final enum NONE:Ltg/d$c$b;

.field public static final enum SHIFT:Ltg/d$c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Ltg/d$c$b;

    const-string v1, "A"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ltg/d$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltg/d$c$b;->A:Ltg/d$c$b;

    new-instance v1, Ltg/d$c$b;

    const-string v3, "B"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ltg/d$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ltg/d$c$b;->B:Ltg/d$c$b;

    new-instance v3, Ltg/d$c$b;

    const-string v5, "C"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Ltg/d$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Ltg/d$c$b;->C:Ltg/d$c$b;

    new-instance v5, Ltg/d$c$b;

    const-string v7, "SHIFT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Ltg/d$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v5, Ltg/d$c$b;->SHIFT:Ltg/d$c$b;

    new-instance v7, Ltg/d$c$b;

    const-string v9, "NONE"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Ltg/d$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v7, Ltg/d$c$b;->NONE:Ltg/d$c$b;

    const/4 v9, 0x5

    new-array v9, v9, [Ltg/d$c$b;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Ltg/d$c$b;->$VALUES:[Ltg/d$c$b;

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

.method public static valueOf(Ljava/lang/String;)Ltg/d$c$b;
    .locals 1

    const-class v0, Ltg/d$c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ltg/d$c$b;

    return-object p0
.end method

.method public static values()[Ltg/d$c$b;
    .locals 1

    sget-object v0, Ltg/d$c$b;->$VALUES:[Ltg/d$c$b;

    invoke-virtual {v0}, [Ltg/d$c$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltg/d$c$b;

    return-object v0
.end method
