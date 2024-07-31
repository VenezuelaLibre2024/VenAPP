.class public final synthetic Loi/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/camera/core/s$c;


# instance fields
.field public final synthetic a:Loi/s;

.field public final synthetic b:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(Loi/s;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loi/n;->a:Loi/s;

    iput-object p2, p0, Loi/n;->b:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final a(Lw/i1;)V
    .locals 2

    iget-object v0, p0, Loi/n;->a:Loi/s;

    iget-object v1, p0, Loi/n;->b:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1, p1}, Loi/s;->a(Loi/s;Ljava/util/concurrent/Executor;Lw/i1;)V

    return-void
.end method
