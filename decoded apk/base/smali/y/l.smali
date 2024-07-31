.class public final synthetic Ly/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/core/util/a;


# instance fields
.field public final synthetic a:Ly/o;

.field public final synthetic b:Ly/x;


# direct methods
.method public synthetic constructor <init>(Ly/o;Ly/x;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/l;->a:Ly/o;

    iput-object p2, p0, Ly/l;->b:Ly/x;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ly/l;->a:Ly/o;

    iget-object v1, p0, Ly/l;->b:Ly/x;

    check-cast p1, Ly/f0;

    invoke-static {v0, v1, p1}, Ly/o;->a(Ly/o;Ly/x;Ly/f0;)V

    return-void
.end method
