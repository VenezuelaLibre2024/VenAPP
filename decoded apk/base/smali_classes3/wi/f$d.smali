.class final Lwi/f$d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/g1$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lwi/f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lwi/f;


# direct methods
.method private constructor <init>(Lwi/f;)V
    .locals 0

    iput-object p1, p0, Lwi/f$d;->a:Lwi/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lwi/f;Lwi/f$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lwi/f$d;-><init>(Lwi/f;)V

    return-void
.end method


# virtual methods
.method public a()I
    .locals 1

    iget-object v0, p0, Lwi/f$d;->a:Lwi/f;

    invoke-virtual {v0}, Lwi/f;->g()I

    move-result v0

    return v0
.end method
