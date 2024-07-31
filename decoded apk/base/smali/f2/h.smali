.class public abstract Lf2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static c()Lf2/h;
    .locals 1

    new-instance v0, Lf2/h$a;

    invoke-direct {v0}, Lf2/h$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public abstract a(Ljava/lang/String;)Lf2/g;
.end method

.method public final b(Ljava/lang/String;)Lf2/g;
    .locals 1

    invoke-virtual {p0, p1}, Lf2/h;->a(Ljava/lang/String;)Lf2/g;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p1}, Lf2/g;->a(Ljava/lang/String;)Lf2/g;

    move-result-object v0

    :cond_0
    return-object v0
.end method
