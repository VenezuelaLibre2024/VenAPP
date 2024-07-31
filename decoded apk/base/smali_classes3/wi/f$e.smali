.class final Lwi/f$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/g1$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwi/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "e"
.end annotation


# instance fields
.field final synthetic a:Lwi/f;


# direct methods
.method private constructor <init>(Lwi/f;)V
    .locals 0

    iput-object p1, p0, Lwi/f$e;->a:Lwi/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lwi/f;Lwi/f$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lwi/f$e;-><init>(Lwi/f;)V

    return-void
.end method


# virtual methods
.method public a()Lio/grpc/internal/t;
    .locals 1

    iget-object v0, p0, Lwi/f$e;->a:Lwi/f;

    invoke-virtual {v0}, Lwi/f;->d()Lwi/f$f;

    move-result-object v0

    return-object v0
.end method
