.class public final synthetic Ln6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ln6/c;

.field public final synthetic b:Lh6/p;

.field public final synthetic c:Lf6/h;

.field public final synthetic d:Lh6/i;


# direct methods
.method public synthetic constructor <init>(Ln6/c;Lh6/p;Lf6/h;Lh6/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/a;->a:Ln6/c;

    iput-object p2, p0, Ln6/a;->b:Lh6/p;

    iput-object p3, p0, Ln6/a;->c:Lf6/h;

    iput-object p4, p0, Ln6/a;->d:Lh6/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Ln6/a;->a:Ln6/c;

    iget-object v1, p0, Ln6/a;->b:Lh6/p;

    iget-object v2, p0, Ln6/a;->c:Lf6/h;

    iget-object v3, p0, Ln6/a;->d:Lh6/i;

    invoke-static {v0, v1, v2, v3}, Ln6/c;->b(Ln6/c;Lh6/p;Lf6/h;Lh6/i;)V

    return-void
.end method
