.class public Lx8/h$a;
.super Lx8/a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lx8/a<",
        "Lx8/h$a;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lx8/a;-><init>()V

    return-void
.end method


# virtual methods
.method public final bridge synthetic c()Lx8/a;
    .locals 1

    invoke-virtual {p0}, Lx8/h$a;->l()Lx8/h$a;

    move-result-object v0

    return-object v0
.end method

.method public k()Lx8/h;
    .locals 1

    new-instance v0, Lx8/h;

    invoke-direct {v0, p0}, Lx8/h;-><init>(Lx8/a;)V

    return-object v0
.end method

.method public l()Lx8/h$a;
    .locals 0

    return-object p0
.end method
