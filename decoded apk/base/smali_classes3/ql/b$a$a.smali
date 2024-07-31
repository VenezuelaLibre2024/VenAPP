.class final Lql/b$a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lql/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lql/b$a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "a"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lql/e0;Lql/c0;)Lql/a0;
    .locals 0

    const-string p1, "response"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/n;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method
