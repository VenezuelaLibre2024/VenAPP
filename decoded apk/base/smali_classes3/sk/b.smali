.class public final Lsk/b;
.super Lsk/a;
.source "SourceFile"


# instance fields
.field private final c:Lsk/b$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lsk/a;-><init>()V

    new-instance v0, Lsk/b$a;

    invoke-direct {v0}, Lsk/b$a;-><init>()V

    iput-object v0, p0, Lsk/b;->c:Lsk/b$a;

    return-void
.end method


# virtual methods
.method public f()Ljava/util/Random;
    .locals 2

    iget-object v0, p0, Lsk/b;->c:Lsk/b$a;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "implStorage.get()"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/n;->d(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/util/Random;

    return-object v0
.end method
