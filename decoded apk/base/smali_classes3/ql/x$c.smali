.class public final Lql/x$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lql/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lql/x$c$a;
    }
.end annotation


# static fields
.field public static final c:Lql/x$c$a;


# instance fields
.field private final a:Lql/t;

.field private final b:Lql/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lql/x$c$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lql/x$c$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Lql/x$c;->c:Lql/x$c$a;

    return-void
.end method

.method private constructor <init>(Lql/t;Lql/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lql/x$c;->a:Lql/t;

    iput-object p2, p0, Lql/x$c;->b:Lql/b0;

    return-void
.end method

.method public synthetic constructor <init>(Lql/t;Lql/b0;Lkotlin/jvm/internal/g;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lql/x$c;-><init>(Lql/t;Lql/b0;)V

    return-void
.end method


# virtual methods
.method public final a()Lql/b0;
    .locals 1

    iget-object v0, p0, Lql/x$c;->b:Lql/b0;

    return-object v0
.end method

.method public final b()Lql/t;
    .locals 1

    iget-object v0, p0, Lql/x$c;->a:Lql/t;

    return-object v0
.end method
