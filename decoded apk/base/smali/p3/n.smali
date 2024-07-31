.class public final Lp3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh3/l;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lh3/l<",
        "TT;>;"
    }
.end annotation


# static fields
.field private static final b:Lh3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lh3/l<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lp3/n;

    invoke-direct {v0}, Lp3/n;-><init>()V

    sput-object v0, Lp3/n;->b:Lh3/l;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lp3/n;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">()",
            "Lp3/n<",
            "TT;>;"
        }
    .end annotation

    sget-object v0, Lp3/n;->b:Lh3/l;

    check-cast v0, Lp3/n;

    return-object v0
.end method


# virtual methods
.method public a(Landroid/content/Context;Lj3/v;II)Lj3/v;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Lj3/v<",
            "TT;>;II)",
            "Lj3/v<",
            "TT;>;"
        }
    .end annotation

    return-object p2
.end method

.method public b(Ljava/security/MessageDigest;)V
    .locals 0

    return-void
.end method
