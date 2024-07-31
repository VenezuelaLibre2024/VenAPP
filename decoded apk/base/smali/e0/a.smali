.class public Le0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ld0/a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-class v0, Ld0/a;

    invoke-static {v0}, Ld0/b;->a(Ljava/lang/Class;)Landroidx/camera/core/impl/s1;

    move-result-object v0

    check-cast v0, Ld0/a;

    iput-object v0, p0, Le0/a;->a:Ld0/a;

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Le0/a;->a:Ld0/a;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ld0/a;->a()I

    move-result v0

    :goto_0
    return v0
.end method
