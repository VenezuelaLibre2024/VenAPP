.class public final synthetic Lpc/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lpc/x;

.field public final synthetic b:Lee/b;


# direct methods
.method public synthetic constructor <init>(Lpc/x;Lee/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpc/m;->a:Lpc/x;

    iput-object p2, p0, Lpc/m;->b:Lee/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lpc/m;->a:Lpc/x;

    iget-object v1, p0, Lpc/m;->b:Lee/b;

    invoke-static {v0, v1}, Lpc/n;->j(Lpc/x;Lee/b;)V

    return-void
.end method
