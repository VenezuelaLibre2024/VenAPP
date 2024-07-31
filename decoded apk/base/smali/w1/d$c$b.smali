.class public final enum Lw1/d$c$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/d$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lw1/d$c$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lw1/d$c$b;

.field public static final enum ON_CONFIGURE:Lw1/d$c$b;

.field public static final enum ON_CREATE:Lw1/d$c$b;

.field public static final enum ON_DOWNGRADE:Lw1/d$c$b;

.field public static final enum ON_OPEN:Lw1/d$c$b;

.field public static final enum ON_UPGRADE:Lw1/d$c$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lw1/d$c$b;

    const-string v1, "ON_CONFIGURE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lw1/d$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw1/d$c$b;->ON_CONFIGURE:Lw1/d$c$b;

    new-instance v0, Lw1/d$c$b;

    const-string v1, "ON_CREATE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lw1/d$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw1/d$c$b;->ON_CREATE:Lw1/d$c$b;

    new-instance v0, Lw1/d$c$b;

    const-string v1, "ON_UPGRADE"

    const/4 v2, 0x2

    invoke-direct {v0, v1, v2}, Lw1/d$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw1/d$c$b;->ON_UPGRADE:Lw1/d$c$b;

    new-instance v0, Lw1/d$c$b;

    const-string v1, "ON_DOWNGRADE"

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lw1/d$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw1/d$c$b;->ON_DOWNGRADE:Lw1/d$c$b;

    new-instance v0, Lw1/d$c$b;

    const-string v1, "ON_OPEN"

    const/4 v2, 0x4

    invoke-direct {v0, v1, v2}, Lw1/d$c$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lw1/d$c$b;->ON_OPEN:Lw1/d$c$b;

    invoke-static {}, Lw1/d$c$b;->b()[Lw1/d$c$b;

    move-result-object v0

    sput-object v0, Lw1/d$c$b;->$VALUES:[Lw1/d$c$b;

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

.method private static final synthetic b()[Lw1/d$c$b;
    .locals 3

    const/4 v0, 0x5

    new-array v0, v0, [Lw1/d$c$b;

    const/4 v1, 0x0

    sget-object v2, Lw1/d$c$b;->ON_CONFIGURE:Lw1/d$c$b;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lw1/d$c$b;->ON_CREATE:Lw1/d$c$b;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lw1/d$c$b;->ON_UPGRADE:Lw1/d$c$b;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lw1/d$c$b;->ON_DOWNGRADE:Lw1/d$c$b;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lw1/d$c$b;->ON_OPEN:Lw1/d$c$b;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lw1/d$c$b;
    .locals 1

    const-class v0, Lw1/d$c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lw1/d$c$b;

    return-object p0
.end method

.method public static values()[Lw1/d$c$b;
    .locals 1

    sget-object v0, Lw1/d$c$b;->$VALUES:[Lw1/d$c$b;

    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lw1/d$c$b;

    return-object v0
.end method
