.class public final enum Lmd/d$a;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lmd/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lmd/d$a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lmd/d$a;

.field public static final enum DEFAULT:Lmd/d$a;

.field public static final enum FIXED:Lmd/d$a;

.field public static final enum SIGNED:Lmd/d$a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lmd/d$a;

    const-string v1, "DEFAULT"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lmd/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lmd/d$a;->DEFAULT:Lmd/d$a;

    new-instance v1, Lmd/d$a;

    const-string v3, "SIGNED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lmd/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lmd/d$a;->SIGNED:Lmd/d$a;

    new-instance v3, Lmd/d$a;

    const-string v5, "FIXED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lmd/d$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lmd/d$a;->FIXED:Lmd/d$a;

    const/4 v5, 0x3

    new-array v5, v5, [Lmd/d$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lmd/d$a;->$VALUES:[Lmd/d$a;

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

.method public static valueOf(Ljava/lang/String;)Lmd/d$a;
    .locals 1

    const-class v0, Lmd/d$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lmd/d$a;

    return-object p0
.end method

.method public static values()[Lmd/d$a;
    .locals 1

    sget-object v0, Lmd/d$a;->$VALUES:[Lmd/d$a;

    invoke-virtual {v0}, [Lmd/d$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lmd/d$a;

    return-object v0
.end method
