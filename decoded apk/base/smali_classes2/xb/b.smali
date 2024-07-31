.class public final Lxb/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lxb/a;


# direct methods
.method private constructor <init>(Lxb/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxb/b;->a:Lxb/a;

    return-void
.end method

.method public static a([BLjb/y;)Lxb/b;
    .locals 0

    if-eqz p1, :cond_0

    new-instance p1, Lxb/b;

    invoke-static {p0}, Lxb/a;->a([B)Lxb/a;

    move-result-object p0

    invoke-direct {p1, p0}, Lxb/b;-><init>(Lxb/a;)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "SecretKeyAccess required"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public b()I
    .locals 1

    iget-object v0, p0, Lxb/b;->a:Lxb/a;

    invoke-virtual {v0}, Lxb/a;->c()I

    move-result v0

    return v0
.end method
