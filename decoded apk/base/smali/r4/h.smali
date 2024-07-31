.class public final synthetic Lr4/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq4/k$a;


# instance fields
.field public final synthetic a:Lr4/f$b;

.field public final synthetic b:Lr4/b;


# direct methods
.method public synthetic constructor <init>(Lr4/f$b;Lr4/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr4/h;->a:Lr4/f$b;

    iput-object p2, p0, Lr4/h;->b:Lr4/b;

    return-void
.end method


# virtual methods
.method public final a(Ljava/io/File;)V
    .locals 2

    iget-object v0, p0, Lr4/h;->a:Lr4/f$b;

    iget-object v1, p0, Lr4/h;->b:Lr4/b;

    invoke-static {v0, v1, p1}, Lr4/f$b$a;->b(Lr4/f$b;Lr4/b;Ljava/io/File;)V

    return-void
.end method
