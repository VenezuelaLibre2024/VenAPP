.class public Lbi/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lbi/a;


# instance fields
.field private a:Lql/y;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lbi/a;

    invoke-direct {v0}, Lbi/a;-><init>()V

    sput-object v0, Lbi/a;->b:Lbi/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lql/y;
    .locals 1

    iget-object v0, p0, Lbi/a;->a:Lql/y;

    if-nez v0, :cond_0

    new-instance v0, Lql/y;

    invoke-direct {v0}, Lql/y;-><init>()V

    iput-object v0, p0, Lbi/a;->a:Lql/y;

    :cond_0
    iget-object v0, p0, Lbi/a;->a:Lql/y;

    return-object v0
.end method
