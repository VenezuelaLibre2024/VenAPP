.class Lw6/j$a;
.super Ljava/lang/Thread;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lw6/j;-><init>([Lw6/g;[Lw6/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lw6/j;


# direct methods
.method constructor <init>(Lw6/j;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lw6/j$a;->a:Lw6/j;

    invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lw6/j$a;->a:Lw6/j;

    invoke-static {v0}, Lw6/j;->e(Lw6/j;)V

    return-void
.end method
