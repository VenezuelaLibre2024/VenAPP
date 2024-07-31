.class public final enum Lie/f$b;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lie/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lie/f$b;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lie/f$b;

.field public static final enum AUTH_ERROR:Lie/f$b;

.field public static final enum BAD_CONFIG:Lie/f$b;

.field public static final enum OK:Lie/f$b;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lie/f$b;

    const-string v1, "OK"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lie/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lie/f$b;->OK:Lie/f$b;

    new-instance v1, Lie/f$b;

    const-string v3, "BAD_CONFIG"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lie/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lie/f$b;->BAD_CONFIG:Lie/f$b;

    new-instance v3, Lie/f$b;

    const-string v5, "AUTH_ERROR"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lie/f$b;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lie/f$b;->AUTH_ERROR:Lie/f$b;

    const/4 v5, 0x3

    new-array v5, v5, [Lie/f$b;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lie/f$b;->$VALUES:[Lie/f$b;

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

.method public static valueOf(Ljava/lang/String;)Lie/f$b;
    .locals 1

    const-class v0, Lie/f$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lie/f$b;

    return-object p0
.end method

.method public static values()[Lie/f$b;
    .locals 1

    sget-object v0, Lie/f$b;->$VALUES:[Lie/f$b;

    invoke-virtual {v0}, [Lie/f$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lie/f$b;

    return-object v0
.end method
